package stepDefinitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class PaymentStep {
    WebDriver driver = Environment.driver;

    @Then("Eu sou PaymentPage")
    public void eu_sou_PaymentPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Valido se é apresentado os campos para informar os dados de pagamento")
    public void valido_se_é_apresentado_os_campos_para_informar_os_dados_de_pagamento() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
