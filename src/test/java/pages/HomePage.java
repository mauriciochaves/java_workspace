package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {


    public By especification = By.xpath("(//a[contains(text(),'SAIBA MAIS')])[2]");

    //em cada page é necessario no construtor passar o super(driver) e extends BasePage
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void especializacaoClickOn () {
        WebElement espec = driver.findElement(especification);
        click(driver,espec);
    }

    public void categoriaEspecializacao () {
        WebElement catgEspec = driver.findElement(By.cssSelector("li.cat-item.cat-item-126 > a"));
        click(driver,catgEspec);
    }



    public void fieldInSearch (String text) {
        WebElement search = driver.findElement(By.cssSelector("#search-4 > form > label > input"));
        send(driver,search, text);
    }

    public void searchClickOn () {
        WebElement search_button = driver.findElement(By.cssSelector("#search-4 > form > input"));
        click(driver,search_button);
    }

    public String validSearch () {
        WebElement title_page = driver.findElement(By.cssSelector("li[itemprop=itemListElement]:nth-child(2)"));
        String text = find(driver,title_page).getText();
        return text;
   }

    public void resultClick () {
        WebElement return_search = driver.findElement(By.cssSelector("h2 > a"));
        click(driver,return_search);
    }

}
