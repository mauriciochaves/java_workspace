package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SearchPage;

public class SearchStep {
    SearchPage search;

    @When("A página de pesquisa está carregada com sucesso")
    public void aPáginaDePesquisaEstáCarregadaComSucesso()  {
        search = new SearchPage();

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

    @And("clico em Salvar Orçamento no carro {string} da lista de resultados")
    public void clicoEmSalvarOrçamentoNoCarroDaListaDeResultados(String car) throws InterruptedException {
        search.saveBudgetClickOn(car);
    }
}
