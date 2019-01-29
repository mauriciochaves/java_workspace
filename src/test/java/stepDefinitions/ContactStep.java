package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class ContactStep {
    WebDriver driver = Environment.driver;

    @When("Eu acesso ContactPage")
    public void eu_acesso_ContactPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Digito a pergunta {string} e clico em Pesquisar")
    public void digito_a_pergunta_e_clico_em_Pesquisar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Abro a descrição da pergunta feita")
    public void abro_a_descrição_da_pergunta_feita() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("efetuo like na resposta")
    public void efetuo_like_na_resposta() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Valido a mensagem de sucesso é igual à {string}")
    public void valido_a_mensagem_de_sucesso_é_igual_à(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
