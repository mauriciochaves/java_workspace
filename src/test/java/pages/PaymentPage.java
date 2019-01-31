package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    private By lbl_title_data_payment = By.cssSelector(".box h2");
    private By select_card_banner = By.cssSelector("#paymentMethod:nth-child(2)"); //cardType_input
    private By tx_card_name = By.id("cardName_input");
    private By tx_card_number = By.id("cardNumberMasked");
    private By select_card_mounth = By.cssSelector(".form-border.exday");  //cardExpiryMonth
    private By select_card_year = By.cssSelector("span[class=form-border]:nth-child(1)"); // //cardExpiryYear
    private By tx__card_security_number = By.id("cardCCV_input");

    public String getTitleDataPayment(){
        return text(lbl_title_data_payment);
    }

    public Boolean returnDataPaymentIsDisplay(){
        Boolean result = Boolean.FALSE;

        if (isDisplay(select_card_banner) && isDisplay(tx_card_name) && isDisplay(tx_card_number)
        && isDisplay(select_card_mounth) && isDisplay(select_card_year) && isDisplay(tx__card_security_number)){
            result= Boolean.TRUE;
        }
        return result;
    }
}
