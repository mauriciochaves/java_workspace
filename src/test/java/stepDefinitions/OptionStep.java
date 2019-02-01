package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.Assert;
import pages.OptionPage;

public class OptionStep {
    OptionPage option;

    @And("A página de opções está carregada com sucesso")
    public void aPáginaDeOpçõesEstáCarregadaComSucesso() {
        option= new OptionPage();
        option.switchNewTabOption();
        Assert.assertEquals("Localização da locadora",option.getTitleRentalLocalization());

    }

    @And("clico em Prosseguir ao pagamento sem cobertura superior")
    public void clicoEmProsseguirAoPagamentoSemCoberturaSuperior() {
        option.continuePaymentWithoutCoverClickOn();

    }
}
