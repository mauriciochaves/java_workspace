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
    protected WebDriverWait wait;


    protected BasePage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
        wait = new WebDriverWait(driver, 30);
    }


    protected void click (WebElement element){
        find_for_click(element).click();
    }

    protected WebElement find (WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement find_for_click (WebElement element){
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected List<WebElement> find_for_list (List<WebElement> element){
        return  wait.until(ExpectedConditions.visibilityOfAllElements(element));

    }

    protected void send (WebElement element, String text, Boolean clean){
        WebElement elem = find_for_click(element);

        if (clean == true){
            clear(elem);
            find(elem).sendKeys(text);

        }else {
            find(elem).sendKeys(text);
        }
    }

    protected void clear (WebElement element){
        find(element).clear();
    }

    protected void move (WebElement element){
        action.moveToElement(find(element)).build().perform();

    }

    protected void move_for_click (WebElement element){
        action.moveToElement(find(element)).click().build().perform();

    }

    protected void double_click (WebElement element){
        action.moveToElement(find(element)).doubleClick().build().perform();

    }
}
