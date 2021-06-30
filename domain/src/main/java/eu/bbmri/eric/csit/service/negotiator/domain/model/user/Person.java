package eu.bbmri.eric.csit.service.negotiator.domain.model.user;

import eu.bbmri.eric.csit.service.negotiator.domain.model.BaseEntity;

import lombok.*;
import javax.persistence.*;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "person")
public class Person extends BaseEntity {
    private String auth_subject;
    private String auth_name;
    private String aut_email;
    private String person_image;
    private Boolean is_admin;
    private String organization;
}
