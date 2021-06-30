package eu.bbmri.eric.csit.service.negotiator.repository.dao.request.form;

import eu.bbmri.eric.csit.service.negotiator.domain.model.request.form.FormRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRequestRepository extends JpaRepository<FormRequest, Long> {
}
