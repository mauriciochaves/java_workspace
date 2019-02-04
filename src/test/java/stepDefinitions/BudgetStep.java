package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.BudgetPage;

public class BudgetStep {
    BudgetPage budge;

    @Then("A página de orçamento está carregada com sucesso")
    public void getBudgePage() {
        budge = new BudgetPage();
        Assert.assertEquals("Enviar orçamento", budge.getTitleBudgeSend());

    }

    @And("preencho os dados do condutor onde Nome: {string}, Sobrenome: {string}, email: {string}, Telefone: {string}")
    public void setDataConductor(String firstname, String lastname, String email, String phone) {
        budge.setDataConductor(firstname, lastname, email, phone);
    }

    @And("clico em Enviar Email")
    public void sendEmailClick() {
        budge.sendEmailClickOn();

    }

    @And("Verifico a mensagem de sucesso")
    public void getMessageSuccess() {
        Assert.assertEquals("Obrigado Testes, Seu orçamento está a caminho.", budge.getMessageThankUser());

    }
}


