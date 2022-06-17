package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        driver.findElement(By.name("firstname")).sendKeys("FN_test");;
        driver.findElement(By.name("lastname")).sendKeys("LN_test");
        driver.findElement(By.name("email")).sendKeys(this.generateEmail());
        driver.findElement(By.name("telephone")).sendKeys("1234567");
        driver.findElement(By.name("password")).sendKeys("Testing123!");
        driver.findElement(By.name("confirm")).sendKeys("Testing123!");
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    @Then("a new account created")
    public void a_new_account_created() throws InterruptedException {
        Thread.sleep(1000);
        String expTxt = driver.findElement(By.cssSelector("#content h1")).getText();
        if (!expTxt.equals("Your Account Has Been Created!"))
            fail("Error: Login Failed!");
    }

    @Then("I am logged in with my new account")
    public void i_am_logged_in_with_my_new_account() throws InterruptedException {
    Thread.sleep(1000);
    String expTxt = driver.findElement(By.cssSelector("#content h2")).getText();
        if (!expTxt.equals("My Account"))
            fail("Error: Login Failed!");
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
        Thread.sleep(1000);
        String expMsg = "Warning: E-Mail Address is already registered!";
        String actualMsg = driver.findElement(By.cssSelector(".alert")).getText();
        if (!expMsg.equals(actualMsg))
            fail("Error message failed to display");
    }

    @Given("I am login from the home page")
    public void i_am_login_from_the_home_page() {
        driver.findElement(By.cssSelector("a[title='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
    }

    @When("I login with valid credential")
    public void i_login_with_valid_credential() {
        driver.findElement(By.name("email")).sendKeys("test1.sa@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Testing123!");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }



    public String generateEmail () {
        int min = 1;
        int max = 500;
        int rand = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(rand);
        String email = rand + "_test.sa@gmail.com";
        System.out.println("email: " + email);
        return email;
    }

}
