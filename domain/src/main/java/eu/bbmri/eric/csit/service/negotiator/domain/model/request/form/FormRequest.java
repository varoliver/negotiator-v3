package eu.bbmri.eric.csit.service.negotiator.domain.model.request.form;

import eu.bbmri.eric.csit.service.negotiator.domain.model.BaseEntity;
import eu.bbmri.eric.csit.service.negotiator.domain.model.request.Request;
import lombok.*;
import javax.persistence.*;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "from_request")
public class FormRequest extends BaseEntity {
    @ManyToOne
    @JoinColumn
    private Request request;
}
