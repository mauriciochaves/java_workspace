package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    //em cada page é necessario no construtor passar o super(driver) e extends BasePage
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private By lbl_devolution_location = By.cssSelector(".search-summary__location");
    private By list_results_cars_page = By.cssSelector(".carResultDiv");

    public String getLocationPreview(){
        return find(driver.findElement(lbl_devolution_location)).getText();
    }

    public void selectFilterDepositWithdrawal (String value){

        click(driver.findElement(By.cssSelector("#deposit-filter-content li:nth-child("+indexDepositWithdrawal(value)+") div")));
    }

    public int indexDepositWithdrawal(String value){
        int count =0;

        if ("1,250".equals(value)) {
            count = 1;
        } else if ("2,450".equals(value)) {
            count = 2;
        } else if ("3,750".equals(value)) {
            count = 3;
        } else{
            count = 4;
        }

        return count;
    }

    public void selectFilterCarSize(String TypeCar){
        move_for_click(driver.findElement(By.cssSelector(".sr-CarCategories_Item:nth-child("+indexFilterCarSize(TypeCar)+")")));

    }

    public int getResultTotalCars (){
        return find_for_list(driver.findElements(list_results_cars_page)).toString().length();

    }

    public int indexFilterCarSize (String TyperCar){
        int count = 0;

        if ("Carros Pequenos".equals(TyperCar)) {
            count = 2;
        } else if ("Carros Médios".equals(TyperCar)) {
            count = 3;
        } else if ("Carros Grandes".equals(TyperCar)) {
            count = 4;
        } else{
            count = 5;
        }

        return count;
    }

}
