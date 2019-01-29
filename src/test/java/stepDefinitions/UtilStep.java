package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class UtilStep {
    WebDriver driver = Environment.driver;

    @Given("O usuário acessa à aplicação")
    public void getRentalCars() {
        this.driver.get("https://www.rentalcars.com/");
    }
}
