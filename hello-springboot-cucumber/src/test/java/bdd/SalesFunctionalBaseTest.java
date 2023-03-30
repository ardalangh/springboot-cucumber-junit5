package bdd;

import io.cucumber.spring.CucumberContextConfiguration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = FunctionalTestConfiguration.class)
@CucumberContextConfiguration
public class SalesFunctionalBaseTest {

    @Value("${pcf.app.url}")
    private String appUrl;

    @Value("${server.context-path:/lbs/property/v1}")
    private String contextPath;


    @BeforeAll
    public void setup() {
        String url = appUrl + contextPath;
    }

    @AfterEach
    public void cleanup() {}
}
