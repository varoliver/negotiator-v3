package eu.bbmri.eric.csit.service.negotiator.domain.model.request;

import eu.bbmri.eric.csit.service.negotiator.domain.model.BaseEntity;
import eu.bbmri.eric.csit.service.negotiator.domain.model.request.form.FormRequest;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "request")
public class Request extends BaseEntity {
    private String title;
    private String request_description;
    private String ethics_vote;
    private Boolean test_request;
    private String request_token;

    @OneToMany(
            mappedBy = "request",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private List<FormRequest> formTemplates = new ArrayList<>();
}
