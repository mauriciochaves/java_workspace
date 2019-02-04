package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    private By lbl_message_initial = By.cssSelector(".hub-hero .col-content");

    public String getMessageInitial (){
        return text(lbl_message_initial);

    }

}
