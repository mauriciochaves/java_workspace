package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    private By lbl_message_initial = By.cssSelector(".hub-hero .col-content");
    private By btn_search_car = By.cssSelector("li[data-nav-item='Search']");

    public String getMessageInitial (){
        return text(lbl_message_initial);

    }

    public void SearchCarClickOn(){
        click(btn_search_car);

    }

}
