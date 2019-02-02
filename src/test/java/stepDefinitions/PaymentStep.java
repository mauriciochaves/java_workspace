package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.PaymentPage;

public class PaymentStep {
    PaymentPage payment;


    @Then("A página de pagamento está carregada com sucesso")
    public void getPaymentPage() {
        payment = new PaymentPage();
        Assert.assertEquals("Dados de pagamento", payment.getTitleDataPayment());

    }

    @And("Valido apresentação dos campos necessários para informar os dados de pagamento")
    public void checkFieldsDataPayment() {
        Assert.assertTrue(payment.returnDataPaymentIsDisplay());

    }
}
