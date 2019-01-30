package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public  class BasePage {

    //é criado no construtor o driver para a base page receber o driver
    protected WebDriver driver;
    protected Actions action;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }

    public WebDriverWait wait (WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait;
    }

    public void click (WebElement element){
        find_for_click(element).click();
    }

    public WebElement find (WebElement element){
        return wait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement find_for_click (WebElement element){
        return wait(driver).until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> find_for_list (List<WebElement> element){
        return  wait(driver).until(ExpectedConditions.visibilityOfAllElements(element));

    }

    public void send (WebElement element, String text, Boolean clean){
        WebElement elem = find_for_click(element);

        if (clean == true){
            clear(elem);
            find(elem).sendKeys(text);

        }else {
            find(elem).sendKeys(text);
        }
    }

    public void clear (WebElement element){
        find(element).clear();
    }

    public void move (WebElement element){
        action.moveToElement(find(element)).build().perform();

    }
    public void move_for_click (WebElement element){
        action.moveToElement(find(element)).click().build().perform();

    }

    public void double_click (WebElement element){
        action.moveToElement(find(element)).doubleClick().build().perform();

    }
}
