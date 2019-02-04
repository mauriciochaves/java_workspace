package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    private By list_results_cars_page = By.cssSelector(".carResultDiv");

    public void selectFilterDepositWithdrawal (String value){

        click(By.cssSelector("#deposit-filter-content li:nth-child("+indexDepositWithdrawal(value)+") div"));
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
        move_for_click(By.cssSelector(".sr-CarCategories_Item:nth-child("+indexFilterCarSize(TypeCar)+")"));

    }

    public int getResultTotalCars (){
        return find_for_list(list_results_cars_page).toString().length();

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

    public void continueButtonClickOn (String car) throws InterruptedException {
        Thread.sleep(2000);
        move_for_click(By.xpath("//span[contains(text(),'"+car+"')]/following-sibling::span[contains(text(),'Continuar')]"));

    }

    public void saveBudgetClickOn (String car) throws InterruptedException {
        Thread.sleep(3000);
        move_for_click(By.xpath("//span[contains(text(),'"+car+"')]/../../div/div/a[contains(text(),'Salvar orçamento')]"));

    }
}
