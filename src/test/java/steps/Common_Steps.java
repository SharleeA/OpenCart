package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jruby.RubyProcess;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_Steps {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://20.5.68.248/index.php?route=common/home");
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
