package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    //em cada page é necessario no construtor passar o super(driver) e extends BasePage
    public HomePage(WebDriver driver) {
        super(driver);
    }

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


    public void setPickUpLocation (String text) throws InterruptedException {
        send(driver.findElement(tx_pick_up_location), text, true);
        Thread.sleep(2000);
        move_for_click(driver.findElement(By.xpath("//a/div/em[contains(text(),'"+text+"')]")));

    }

    public void messageCookie(){
        try{
            WebElement element = find(driver.findElement(btn_cookie));
            if (element.isDisplayed()){
                click(element);
            }
        }catch(Exception e){
            System.out.println("Cookie não foi apresentado: "+e.getMessage());
        }
    }

    public void pickUpNextMonthClickOn(){
        click(driver.findElement(btn_pick_up_date_next_month));
    }

    public void setDatesPickUpDropOff (int date_pick_up, int date_drop_off, int passMonth) {
        if (!(date_drop_off < date_pick_up)){
            click(driver.findElement(cb_pick_up_date));

            WebElement element_tbody = find(driver.findElement(By.className("ui-datepicker-calendar")));
            if (element_tbody.isDisplayed()){
                move_for_click(driver.findElement(By.xpath("//a[contains(text(),'"+date_pick_up+"')]")));

                //efetua click no next do calendario do mês
                for (int click =1; click <=passMonth; click++) {
                    pickUpNextMonthClickOn();
                }
                click(driver.findElement(By.xpath("//a[contains(text(),'"+date_drop_off+"')]")));
            }
        }

    }

    public void setAgedBetween (String age) throws InterruptedException {
        Thread.sleep(1000);
        if ( Integer.parseInt(age) < 30){
            click(driver.findElement(cb_age_between));
            send(driver.findElement(tx_age_between), age, true);
        }
    }

    public void searchClickOn(){
        click(driver.findElement(btn_search));
    }

    public void loginMenuClickOn(){
        click(driver.findElement(btn_login_menu));

    }

    public void login(String email, String password){
        send(driver.findElement(tx_email), email, true);
        send(driver.findElement(tx_password), password, true);
        click(driver.findElement(btn_login));

    }

    public String getMessageLoginSucess() throws InterruptedException {
        Thread.sleep(1000);
        return find(driver.findElement(lbl_message_login_sucess)).getText();
    }
    public void controlPanelClickOn(){
        click(driver.findElement(btn_menu_control_panel));
    }
}
