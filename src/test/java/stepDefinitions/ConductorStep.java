package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.Assert;
import pages.ConductorPage;


public class ConductorStep {
    ConductorPage conductor;
    
    @And("A página do condutor do veículo carregada com sucesso")
    public void aPáginaDoCondutorDoVeículoCarregadaComSucesso() {
        conductor = new ConductorPage();
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
