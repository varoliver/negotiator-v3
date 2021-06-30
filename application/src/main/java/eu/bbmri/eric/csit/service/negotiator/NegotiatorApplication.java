package eu.bbmri.eric.csit.service.negotiator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"eu.bbmri.eric.csit.service.negotiator.domain.*"})
public class NegotiatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(NegotiatorApplication.class, args);
    }

}
