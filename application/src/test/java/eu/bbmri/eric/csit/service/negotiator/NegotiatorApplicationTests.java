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

import java.util.Date;

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
    void integrationTestForDatabase() {
        personRepository.save(new Person());
        personRepository.flush();

        personRepository.save(createPerson());
        personRepository.flush();

        requestRepository.save(new Request());
        personRepository.flush();

        formRequestRepository.save(new FormRequest());
        personRepository.flush();
    }

    private Person createPerson() {
        Person person = new Person();
        person.setAut_email("robert.reihs@gmail.com");
        person.setAuth_name("Robert Reihs");
        person.setOrganization("BBMRI-ERIC");
        person.setCreated_by(1L);
        person.setModified_by(1L);
        person.setCreation_date(new Date());
        person.setModified_date(new Date());
        return person;
    }
}
