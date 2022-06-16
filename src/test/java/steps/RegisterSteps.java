package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  static org.junit.Assert.*;

public class RegisterSteps {
    WebDriver driver;

    public RegisterSteps(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }

    @Given("I register a new account")
    public void i_register_a_new_account() {
        driver.findElement(By.cssSelector("a[title='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();
    }
    @When("I provide an unique email with all mandatory fields")
    public void i_provide_an_unique_email_with_all_mandatory_fields() {
        System.out.println("I provide an unique email with all mandatory fields");
    }
    @When("I submit the form")
    public void i_submit_the_form() {
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }
    @Then("I am logged in with my new account")
    public void i_am_logged_in_with_my_new_account() {
    System.out.println("I am logged in with my new account");
    }

    @When("I provide an email that has already been used in the system")
    public void i_provide_an_email_that_has_already_been_used_in_the_system() {
        driver.findElement(By.name("firstname")).sendKeys("FN_test");;
        driver.findElement(By.name("lastname")).sendKeys("LN_test");
        driver.findElement(By.name("email")).sendKeys("test1.sa@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("1234567");
        driver.findElement(By.name("password")).sendKeys("Testing123!");
        driver.findElement(By.name("confirm")).sendKeys("Testing123!");


    }
    @Then("I see an appropriate error message")
    public void i_see_an_appropriate_error_message() throws InterruptedException {
        System.out.println("I see an appropriate error message");
        Thread.sleep(2000);
        String expMsg = "Warning: E-Mail Address is already registered!";
        String actualMsg = driver.findElement(By.cssSelector(".alert")).getText();
        if (!expMsg.equals(actualMsg))
            fail("Error message failed to display");
    }

}
