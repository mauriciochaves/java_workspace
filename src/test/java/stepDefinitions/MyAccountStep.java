package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class MyAccountStep {
    WebDriver driver = Environment.driver;


    @When("Eu acesso a MyAccountPage")
    public void eu_acesso_a_MyAccountPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Clico em Procurar Carro")
    public void clico_em_Procurar_Carro() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Valido se estou na Minha Conta")
    public void validoSeEstouNaMinhaConta() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
