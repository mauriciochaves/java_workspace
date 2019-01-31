package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
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


    @And("clico em Login")
    public void clicoEmLogin() {
        home.loginMenuClickOn();
    }

    @And("preencho o campo e-mail com {string}, senha com {string} e clico em Login")
    public void preenchoOCampoEMailComSenhaComEClicoEmLogin(String email, String password) {
        home.login(email, password);

    }

    @And("valido a mensagem informando que estou logado com o usuário {string}")
    public void validoAMensagemInformandoQueEstouLogadoComOUsuário(String user) throws InterruptedException {
        String message =  home.getMessageLoginSucess();
        Assert.assertEquals("Bem-vindo,\nVocê está logado como "+user, message);
    }

    @And("clico em Minha Conta")
    public void clicoEmMinhaConta() {
        home.loginMenuClickOn();
    }

    @And("clico em Painel de Controle")
    public void clicoEmPainelDeControle() {
        home.controlPanelClickOn();
    }

    @And("clico em destinos mais buscados")
    public void clicoEmDestinosMaisBuscados() {
        home.mostWantedDestinationsClickOn();

    }

    @And("seleciono a opção {string}")
    public void selecionoAOpção(String destination) {
        home.destinationClickOn(destination);

    }
}
