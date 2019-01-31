package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.OptionPage;

public class OptionStep {
    WebDriver driver = Environment.driver;
    OptionPage option;

    @And("A página de opções está carregada com sucesso")
    public void aPáginaDeOpçõesEstáCarregadaComSucesso() {
        option= new OptionPage(driver);
        option.switchNewTabOption();
        Assert.assertEquals("Localização da locadora",option.getTitleRentalLocalization());

    }


    @And("clico em Prosseguir ao pagamento sem cobertura superior")
    public void clicoEmProsseguirAoPagamentoSemCoberturaSuperior() {
        option.continuePaymentWithoutCoverClickOn();

    }
}
