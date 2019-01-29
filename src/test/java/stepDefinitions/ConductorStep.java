package stepDefinitions;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class ConductorStep {
    WebDriver driver = Environment.driver;

    @When("Eu sou ConductorPage")
    public void eu_sou_ConductorPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Eu preencho os dados do condutor com Titulo com {string}, Nome {string}, Sobrenome {string}, email {string}, telefone {string}")
    public void eu_preencho_os_dados_do_condutor_com_Titulo_com_Nome_Sobrenome_email_telefone(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("clico em reservar")
    public void clico_em_reservar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
