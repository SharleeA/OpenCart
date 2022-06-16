package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSteps {

    @Given("I register a new account")
    public void i_register_a_new_account() {
        System.out.println("I register a new account");
        System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://20.5.68.248/index.php?route=account/register");
    }
    @When("I provide an unique email with all mandatory fields")
    public void i_provide_an_unique_email_with_all_mandatory_fields() {
        System.out.println("I provide an unique email with all mandatory fields");
    }
    @When("I submit the form")
    public void i_submit_the_form() {
        System.out.println("I submit the form");
    }
    @Then("I am logged in with my new account")
    public void i_am_logged_in_with_my_new_account() {
    System.out.println("I am logged in with my new account");
    }

    @When("I provide an email that has already been used in the system")
    public void i_provide_an_email_that_has_already_been_used_in_the_system() {
        System.out.println("I provide an email that has already been used in the system");
    }
    @Then("I see an appropriate error message")
    public void i_see_an_appropriate_error_message() {
        System.out.println("I see an appropriate error message");
    }

}
