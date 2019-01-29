package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.cesar.CesarPage;

public class Environment {

    public static WebDriver driver;
    CesarPage home;

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "..\\java_workspace\\drivers\\chromedriver.exe");

        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        home= new CesarPage(driver);
    }

    @After
    public void afterScenario(){
        this.driver.quit();
    }

}
