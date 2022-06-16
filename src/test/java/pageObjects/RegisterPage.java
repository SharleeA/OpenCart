package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    @FindBy(partialLinkText = "/index.php?route=account/account")
    public  WebElement myAccountLnk;
    @FindBy(partialLinkText = "/index.php?route=account/register")
    public  WebElement registerLnk;

    public RegisterPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

