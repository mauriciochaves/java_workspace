package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BudgetPage extends BasePage {

    private By lbl_message_thank_user = By.cssSelector(".col-2.success-message > h2");
    private By lbl_message_budge_send = By.cssSelector(".col-2.success-message > h3");
    private By lbl_title_budge_send = By.cssSelector(".col-2.quote-form h2");
    private By btn_send_email = By.cssSelector("a[class=cta]");
    private By tx_firstname = By.id("f_name_input");
    private By tx_lastname = By.id("surname_input");
    private By tx_email = By.id("email_input");
    private By tx_phone = By.id("phone_input");

    public void setDataConductor(String firstname, String lastname, String email, String phone){
        send(tx_firstname,firstname, true);
        send(tx_lastname,lastname, true);
        send(tx_email,email, true);
        send(tx_phone,phone, true);

    }

    public String getMessageThankUser(){
        return text(lbl_message_thank_user)+", "+text(lbl_message_budge_send);
    }

    public String getTitleBudgeSend() throws InterruptedException {
        Thread.sleep(2000);
        return text(lbl_title_budge_send);
    }

    public void sendEmailClickOn(){
        click(btn_send_email);
    }
}
