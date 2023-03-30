package bdd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class F1Steps {
    private String moduleCode;

    @Given("^Module code is not \"([^\"]*)\"$")
    public void module_code_is_something(String modulecode) {
        this.moduleCode = modulecode;
    }

    @Then("^do not return properties$")
    public void do_not_return_properties() throws InterruptedException {
        assertEquals(2 , 2);
        Thread.sleep(3000);
    }

}
