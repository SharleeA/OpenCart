package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jruby.RubyProcess;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_Steps {

    private WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://20.5.68.248/index.php?route=common/home");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @After
    public  void tearDown() throws Exception {
        driver.quit();
        Thread.sleep(1000);
    }

    public  WebDriver getDriver(){
        return  driver;
    }
}
