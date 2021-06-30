package eu.bbmri.eric.csit.service.negotiator.repository.dao.user;

import eu.bbmri.eric.csit.service.negotiator.domain.model.user.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
