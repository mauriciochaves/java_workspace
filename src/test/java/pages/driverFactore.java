package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverFactore {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\tools\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesar.school/");
        return driver;
    }
}
