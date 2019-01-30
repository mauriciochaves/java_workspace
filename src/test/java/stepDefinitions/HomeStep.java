package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


public class HomeStep {
    WebDriver driver = Environment.driver;
    HomePage home;


    @Given("preencho o local de retirada com {string}")
    public void preencho_o_local_de_retirada_com(String local) throws InterruptedException {
        home.setPickUpLocation(local);

    }

    @Given("A página inicial está carregada com sucesso")
    public void aPáginaInicialEstaCarregadaComSucesso() {
        home = new HomePage(driver);
        home.messageCookie();

    }

    @And("data de retirada igual à {string} do mês atual e data de devolução igual à {string} do próximo mês")
    public void dataDeRetiradaIgualÀDoMêsAtualEDataDeDevoluçãoIgualÀDoPróximoMês(String date1, String date2){
        home.setDatesPickUpDropOff(Integer.parseInt(date1), Integer.parseInt(date2), 1);

    }

    @And("idade do contudor com {string} anos")
    public void idadeDoContudorComAnos(String idade) throws InterruptedException {
        home.setAgedBetween(idade);

    }

    @Given("clico em pesquisar")
    public void clico_em_pesquisar() {
        home.searchClickOn();

    }

    @Given("Clico em Login")
    public void clico_em_Login() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Preencho o campo email com {string}, senha com {string} e clico em Login")
    public void preencho_o_campo_email_com_senha_com_e_clico_em_Login(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Eu valido a mensagem informando que estou logado com o usuario {string}")
    public void eu_valido_a_mensagem_informando_que_estou_logado_com_o_usuario(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Eu clico em Minha Conta")
    public void eu_clico_em_Minha_Conta() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Clico em Painel de Controle")
    public void clico_em_Painel_de_Controle() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Clico em destinos mais buscados")
    public void clico_em_destinos_mais_buscados() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Seleciono a opção {string}")
    public void seleciono_a_opção(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Clico em Pesquisar")
    public void clico_em_Pesquisar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("clico em Contato")
    public void clico_em_Contato() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
