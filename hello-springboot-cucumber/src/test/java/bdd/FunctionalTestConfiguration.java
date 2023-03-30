package bdd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class FunctionalTestConfiguration {

    private static final Logger LOG = LogManager.getLogger(FunctionalTestConfiguration.class);

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
