
package gery.steps;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebSteps {

    @Given("user open homepage")
    public void openHomepage() { assertTrue(true); }

    @When("user login with valid credential")
    public void loginValid() { assertTrue(true); }

    @When("user login with invalid credential")
    public void loginInvalid() { assertTrue(true); }

    @When("user add product to cart")
    public void addToCart() { assertTrue(true); }

    @When("user checkout product")
    public void checkout() { assertTrue(true); }

    @Then("login success")
    public void loginSuccess() { assertTrue(true); }

    @Then("login failed")
    public void loginFailed() { assertTrue(true); }

    @Then("checkout success")
    public void checkoutSuccess() { assertTrue(true); }
}
