package pages.cesar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CesarPage extends BasePage {

    //em cada page é necessario no construtor passar o super(driver) e extends BasePage
    public CesarPage(WebDriver driver) {
        super(driver);
    }

    private By especification = By.xpath("(//a[contains(text(),'SAIBA MAIS')])[2]");
    private By catEspecification = By.cssSelector("li.cat-item.cat-item-126 > a");
    private By search = By.cssSelector("#search-4 > form > label > input");
    private By search_button = By.cssSelector("#search-4 > form > input");
    private By title_page = By.cssSelector("li[itemprop=itemListElement]:nth-child(2)");
    private By return_search = By.cssSelector("h2 > a");

    public void especializacaoClickOn () {
        click(driver.findElement(especification));
    }

    public void categoriaEspecializacao () {
        click(driver.findElement(catEspecification));
    }

    public void fieldInSearch (String text) {
        send(driver.findElement(search), text, true);
    }

    public void searchClickOn () {
        click(driver.findElement(search_button));
    }

    public String validSearch () {
        String text = find(driver.findElement(title_page)).getText();
        return text;
   }

    public void resultClick () {
        click(driver.findElement(return_search));
    }

}
