
package gery.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApiSteps {

    @Given("user hit get all users api")
    public void getAllUsers() { assertTrue(true); }

    @Given("user hit get user by id")
    public void getUserById() { assertTrue(true); }

    @Given("user create new user")
    public void createUser() { assertTrue(true); }

    @Given("user update user data")
    public void updateUser() { assertTrue(true); }

    @Given("user hit get user with invalid id")
    public void getUserInvalid() { assertTrue(true); }

    @Then("api response success")
    public void apiSuccess() { assertTrue(true); }

    @Then("api response error")
    public void apiError() { assertTrue(true); }
}
