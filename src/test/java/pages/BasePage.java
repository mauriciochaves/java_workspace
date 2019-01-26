package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class BasePage {

    //é criado no construtor o driver para a base page receber o driver
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void quit(WebDriver driver){
        driver.quit();
    }

    public WebDriverWait wait (WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait;
    }

    public void click (WebDriver driver, WebElement element){
        wait(driver).until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public WebElement find (WebDriver driver, WebElement element){
        return wait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    public void send (WebDriver driver, WebElement element, String text){
        wait(driver).until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }
}
