package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import util.Utils;
import java.io.IOException;

public class Environment {

    public static WebDriver driver;
    public Utils util = new Utils();
    String DRIVER_HEEADLESS = "close";
    String CHROME = "chrome";
    String CHROME_EXE = "chromedriver.exe";
    String INTERNET_EXPLORER = "iexplorer";
    String INTERNET_EXPLORER_EXE = "MicrosoftWebDriver.exe";
    String FIREFOX = "firefox";
    String FIREFOX_EXE = "geckodriver.exe";

    String KEY_DRIVER = "DRIVER";
    String KEY_PATH_DRIVER = "PATH_DRIVER";
    String KEY_BROWSER = "BROWSER";


    @Before
    public void beforeScenario() throws IOException {
        if (util.getKey(KEY_BROWSER).equals(FIREFOX)){
            System.setProperty("webdriver.gecko.driver", util.getKey(KEY_PATH_DRIVER)+FIREFOX_EXE);

            if (util.getKey(KEY_DRIVER)==DRIVER_HEEADLESS){
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--headless");
                this.driver = new FirefoxDriver(options);
            } else{
                this.driver = new FirefoxDriver();
            }


        } else if(util.getKey(KEY_BROWSER).equals(INTERNET_EXPLORER)){
            System.setProperty("webdriver.ie.driver",util.getKey(KEY_PATH_DRIVER)+INTERNET_EXPLORER_EXE);
            if (util.getKey(KEY_DRIVER)==DRIVER_HEEADLESS){
                InternetExplorerOptions options = new InternetExplorerOptions();
                options.addCommandSwitches("--headless");
                this.driver= new InternetExplorerDriver(options);
            } else{
                this.driver= new InternetExplorerDriver();
            }


        }else{
            System.setProperty("webdriver.chrome.driver", util.getKey(KEY_PATH_DRIVER)+CHROME_EXE);
            if (util.getKey(KEY_DRIVER)==DRIVER_HEEADLESS){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                this.driver = new ChromeDriver(options);
            } else{
                this.driver = new ChromeDriver();
            }
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void afterScenario(){
        this.driver.quit();
    }

}
