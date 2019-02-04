package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Environment;
import java.util.ArrayList;
import java.util.List;

public  class BasePage {

    //é criado no construtor o driver para a base page receber o driver
    protected WebDriver driver;
    protected Actions action;
    protected WebDriverWait wait;
    List<String> tabs;
    Select combobox;

    protected BasePage() {
        this.driver = Environment.driver;
        action = new Actions(driver);
        wait = new WebDriverWait(driver, 30);

    }

    protected WebDriver driver(){
        return driver;
    }

    protected void click (By by){
        find_for_click(by).click();
    }

    protected String text(By by){
        return find(by).getText();
    }

    protected void double_click (By by){
        action.moveToElement(find(by)).doubleClick().build().perform();

    }

    protected WebElement find (By by){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

    protected WebElement find_for_click (By by){
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    protected List<WebElement> find_for_list (By by){
        return  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(by)));

    }

    protected void send (By by, String text, Boolean clean){


        if (clean == true){
            click(by);
            clear(by);
            find(by).sendKeys(text);

        }else {
            find(by).sendKeys(text);
        }
    }

    protected void clear (By by){
        find(by).clear();
    }

    protected void move (By by){
        action.moveToElement(find(by)).build().perform();

    }

    protected void move_for_click (By by){
        action.moveToElement(find_for_click(by)).click().build().perform();

    }

    protected Boolean isDisplay (By by){
        return driver.findElement(by).isDisplayed();
    }

    protected int getTotalTabs(){
        tabs = new ArrayList<> (driver.getWindowHandles());
        return tabs.size();
    }

    protected void switchToTab(int tab){
    driver.switchTo().window(tabs.get(tab));
    }

    protected void setComboboxByText(By by, String text){
        combobox = new Select(driver.findElement(by));
        combobox.selectByVisibleText(text);
    }

    protected void setComboboxByValue(By by, String value){
        combobox = new Select(driver.findElement(by));
        combobox.selectByValue(value);
    }

}
