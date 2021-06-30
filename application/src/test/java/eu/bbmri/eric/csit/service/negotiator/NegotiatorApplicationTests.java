package eu.bbmri.eric.csit.service.negotiator;

import eu.bbmri.eric.csit.service.negotiator.domain.model.request.Request;
import eu.bbmri.eric.csit.service.negotiator.domain.model.request.form.FormRequest;
import eu.bbmri.eric.csit.service.negotiator.domain.model.user.Person;
import eu.bbmri.eric.csit.service.negotiator.repository.dao.request.RequestRepository;
import eu.bbmri.eric.csit.service.negotiator.repository.dao.request.form.FormRequestRepository;
import eu.bbmri.eric.csit.service.negotiator.repository.dao.user.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class NegotiatorApplicationTests {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private FormRequestRepository formRequestRepository;

    @Test
    void contextLoads() {
        personRepository.save(new Person());
        personRepository.flush();

        requestRepository.save(new Request());
        personRepository.flush();

        formRequestRepository.save(new FormRequest());
        personRepository.flush();
    }

}
