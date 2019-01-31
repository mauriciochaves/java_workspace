package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OptionPage extends BasePage {

    public OptionPage(WebDriver driver) {
        super(driver);
    }

    private By btn_continue_payment_without_cover = By.id("removePolicyButton");
    private By lbl_rental_localization = By.cssSelector("h2[class='section__title']");

    public void continuePaymentWithoutCoverClickOn(){
        click(btn_continue_payment_without_cover);
    }

    public String getTitleRentalLocalization(){
        return text(lbl_rental_localization);
    }

    public void switchNewTabOption(){
        int tabs = getTotalTabs();
        switchToTab(tabs-1);
    }
}
