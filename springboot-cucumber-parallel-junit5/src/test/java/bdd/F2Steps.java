package bdd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class F2Steps {
    private String serviceCode;

    @Given("^Service code is not \"([^\"]*)\"$")
    public void module_code_is_something(String serviceCode) {
        this.serviceCode = serviceCode;
    }

}
