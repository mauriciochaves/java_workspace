package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import pages.HomePage;

public class HomeStep {
    HomePage home;

    @Given("preencho o local de retirada com {string}")
    public void setPlaceWithdrawal(String local) throws InterruptedException {
        home.setPickUpLocation(local);


    }

    @Given("A página inicial está carregada com sucesso")
    public void getHomePage() {
        home = new HomePage();
        home.messageCookie();

    }

    @And("data de retirada igual à {string} do mês atual e data de devolução igual à {string} do próximo mês")
    public void setDateWithdrawalAndDateDevolution(String date1, String date2){
        home.setDatesPickUpDropOff(Integer.parseInt(date1), Integer.parseInt(date2), 1);

    }

    @And("idade do contudor com {string} anos")
    public void setConductorAge(String idade) throws InterruptedException {
        home.setAgedBetween(idade);

    }

    @Given("clico em pesquisar")
    public void searchClick() throws InterruptedException {
        home.searchClickOn();

    }

    @And("clico em Login")
    public void loginClick() {
        home.loginMenuClickOn();
    }

    @And("preencho o campo e-mail com {string}, senha com {string} e clico em Login")
    public void setLogin(String email, String password) {
        home.login(email, password);

    }

    @And("valido a mensagem informando que estou logado com o usuário {string}")
    public void validMessageLogin(String user) throws InterruptedException {
        String message =  home.getMessageLoginSucess();
        Assert.assertEquals("Bem-vindo,\nVocê está logado como "+user, message);
    }

    @And("clico em Minha Conta")
    public void myAccountClick() {
        home.loginMenuClickOn();
    }

    @And("clico em Painel de Controle")
    public void ControlPanelClick() {
        home.controlPanelClickOn();
    }

    @And("clico em destinos mais buscados")
    public void wantedDestinationsClick() {
        home.mostWantedDestinationsClickOn();

    }

    @And("seleciono a opção {string}")
    public void optionClick(String destination) {
        home.destinationClickOn(destination);

    }

    @And("clico em Contato")
    public void contactClick() {
        home.contactClickOn();

    }
}
