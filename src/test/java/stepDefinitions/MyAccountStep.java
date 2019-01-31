package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MyAccountPage;


public class MyAccountStep {
    WebDriver driver = Environment.driver;
    MyAccountPage account;

    @When("a página da minha conta está carregada com sucesso")
    public void aPáginaDaMinhaContaEstáCarregadaComSucesso() {
        account = new MyAccountPage(driver);

    }

    @Then("Verifico se é apresentada Minha Conta")
    public void verificoSeÉApresentadaMinhaConta() {
        Assert.assertEquals("Bem-vindo\nJá completou o seu perfil? Insira os seus dados para poder reservar o seu carro com mais agilidade.", account.getMessageInitial());
    }
}
