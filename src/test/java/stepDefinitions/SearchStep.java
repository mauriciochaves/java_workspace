package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class SearchStep {
    WebDriver driver = Environment.driver;

    @When("Eu acesso a SearchPage")
    public void eu_acesso_a_SearchPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Seleciono a opção {string} para pesquisa")
    public void seleciona_a_opção(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Filtro por Depósito de Retirada abaixo de {string} reais")
    public void filtro_por_Depósito_de_Retirada_abaixo_de__reais(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Filtro por {string}")
    public void filtro_por(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Valido se a pesquisa retornou resultados")
    public void valido_se_a_pesquisa_retornou_resultados() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Seleciono Continuar no carro {string} da lista")
    public void seleciono_Continuar_no_carro_da_lista(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("Clico em Salvar Orçamento")
    public void clicoEmSalvarOrcamento() {
    }
}
