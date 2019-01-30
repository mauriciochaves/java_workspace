package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Environment {

    public static WebDriver driver;

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "..\\java_workspace\\drivers\\chromedriver.exe");

        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void afterScenario(){
        this.driver.quit();
    }

}
