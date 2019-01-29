package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class BudgetStep {

    WebDriver driver = Environment.driver;

    @Then("Eu sou BudgetPage")
    public void eu_sou_BudgetPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Eu preencho o campo Titulo com {string}, Nome {string}, Sobrenome {string}, email {string}, telefone {string}")
    public void eu_preencho_o_campo_Titulo_com_Nome_Sobrenome_email_telefone(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("clico em enviar email")
    public void clico_em_enviar_email() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("valido a mensagem de sucesso")
    public void valido_a_mensagem_de_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
