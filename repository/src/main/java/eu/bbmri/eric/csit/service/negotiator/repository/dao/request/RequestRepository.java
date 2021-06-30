package eu.bbmri.eric.csit.service.negotiator.repository.dao.request;

import eu.bbmri.eric.csit.service.negotiator.domain.model.request.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository  extends JpaRepository<Request, Long> {
}
