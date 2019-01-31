package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ConductorPage;


public class ConductorStep {
    WebDriver driver = Environment.driver;
    ConductorPage conductor;
    
    @And("A página do condutor do veículo carregada com sucesso")
    public void aPáginaDoCondutorDoVeículoCarregadaComSucesso() {
        conductor = new ConductorPage(driver);
        String message = conductor.getTitleDataConductor();
        Assert.assertEquals("Dados do condutor", message);
        
    }

    @And("preencho os dados do condutor onde Título é: {string}, Nome: {string}, Sobrenome: {string}, email: {string}, Telefone: {string}")
    public void preenchoOsDadosDoCondutorOndeTituloÉNomeSobrenomeEmailTelefone(String title, String firstname, String lastname, String email, String phone) {
        conductor.setDataConductor(title,firstname,lastname,email,phone);
    }


    @And("clico em reservar")
    public void clicoEmReservar() {
        conductor.reserveClickOn();
    }
}
