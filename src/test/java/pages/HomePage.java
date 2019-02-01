package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By btn_cookie = By.cssSelector("#js-closeCookieBanner > img");
    private By tx_pick_up_location = By.cssSelector("#ftsAutocomplete");
    private By cb_pick_up_date = By.cssSelector(".date-panel__arrow");
    private By btn_pick_up_date_next_month = By.cssSelector("#dateselect-month-forward");
    private By cb_age_between = By.cssSelector("#driver-over-min-age");
    private By tx_age_between = By.cssSelector("#driver-age-input");
    private By btn_search = By.cssSelector("#formsubmit");
    private By btn_login_menu =By.cssSelector("#rch-select-sign-in");
    private By tx_email = By.id("crmEmail");
    private By tx_password = By.id("crmPsw");
    private By btn_login = By.id("crmLogin");
    private By lbl_message_login_sucess = By.cssSelector("#langCurrencyForm p");
    private By btn_menu_control_panel = By.cssSelector("a[href*=Dashboard]");
    private By btn_most_wanted_destinations = By.id("globalNavCrumbLink");
    private By btn_contact = By.xpath("//a[contains(text(),'Contato')]");

    public void mostWantedDestinationsClickOn() {
        click(btn_most_wanted_destinations);

    }

    public void setPickUpLocation (String text) throws InterruptedException {
        send(tx_pick_up_location, text, true);
        Thread.sleep(2000);
        move_for_click(By.xpath("//a/div/em[contains(text(),'"+text+"')]"));

    }

    public void messageCookie(){
        try{
            if (isDisplay(btn_cookie)){
                click(btn_cookie);
            }
        }catch(Exception e){
            System.out.println("Cookie não foi apresentado: "+e.getMessage());
        }
    }

    public void pickUpNextMonthClickOn(){
        click(btn_pick_up_date_next_month);
    }

    public void setDatesPickUpDropOff (int date_pick_up, int date_drop_off, int passMonth) {
        if (!(date_drop_off < date_pick_up)){
            click(cb_pick_up_date);

            WebElement element_tbody = find(By.className("ui-datepicker-calendar"));
            if (element_tbody.isDisplayed()){
                move_for_click(By.xpath("//a[contains(text(),'"+date_pick_up+"')]"));

                //efetua click no next do calendario do mês
                for (int click =1; click <=passMonth; click++) {
                    pickUpNextMonthClickOn();
                }
                click(By.xpath("//a[contains(text(),'"+date_drop_off+"')]"));
            }
        }

    }

    public void setAgedBetween (String age) throws InterruptedException {
        Thread.sleep(1000);
        if ( Integer.parseInt(age) < 30){
            click(cb_age_between);
            send(tx_age_between, age, true);
        }
    }

    public void searchClickOn(){
        click(btn_search);
    }

    public void loginMenuClickOn(){
        click(btn_login_menu);

    }

    public void login(String email, String password){
        send(tx_email, email, true);
        send(tx_password, password, true);
        click(btn_login);

    }

    public String getMessageLoginSucess() throws InterruptedException {
        Thread.sleep(1000);
        return text(lbl_message_login_sucess);
    }

    public void controlPanelClickOn(){
        click(btn_menu_control_panel);
    }

    public void destinationClickOn(String destination){
        click(By.xpath("//em[contains(text(),'"+destination+"')]"));
    }

    public void contactClickOn(){
        click(btn_contact);
    }
}
