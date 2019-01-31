package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;


public class SearchStep {
    WebDriver driver = Environment.driver;
    SearchPage search;

    @When("A página de pesquisa está carregada com sucesso")
    public void aPáginaDePesquisaEstáCarregadaComSucesso() {
        search = new SearchPage(driver);

    }

    @When("filtro por depósito de retirada abaixo de {string} reais")
    public void filtro_por_Depósito_de_Retirada_abaixo_de__reais(String value) {
        search.selectFilterDepositWithdrawal(value);

    }

    @When("filtro por {string}")
    public void filtro_por(String filtro) {
        search.selectFilterCarSize(filtro);

    }

    @Then("Verifico se a pesquisa retornou resultados")
    public void verificoSeAPesquisaRetornouResultados() {
        Assert.assertTrue(search.getResultTotalCars() != 0);

    }


    @And("seleciono Continuar no carro {string} da lista de resultados")
    public void selecionoContinuarNoCarroDaListaDeResultados(String car) throws InterruptedException {
        search.continueButtonClickOn(car);
    }
}
