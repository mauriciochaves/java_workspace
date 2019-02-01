package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConductorPage extends BasePage {

    private By lbl_title_data_conductor = By.cssSelector(".box h2");
    private By select_title = By.cssSelector(".form-border:nth-child(2) select");
    private By tx_firstname = By.id("f_name_input");
    private By tx_lastname = By.id("surname_input");
    private By tx_email = By.id("booking-form-email");
    private By tx_phone = By.id("phone_input");
    private By btn_reserve = By.id("btn-submit-dd");

    public String getTitleDataConductor(){
        return find(lbl_title_data_conductor).getText();
    }

    public void setDataConductor(String title, String firstname, String lastname, String email, String phone){
        setComboboxByText(select_title,title);
        send(tx_firstname,firstname, true);
        send(tx_lastname,lastname, true);
        send(tx_email,email, true);
        send(tx_phone,phone, true);

    }

    public void reserveClickOn(){
        move_for_click(btn_reserve);

    }



}
