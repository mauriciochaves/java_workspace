package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.ContactPage;

public class ContactStep {
ContactPage contact;

    @When("A página de ajuda e suporte está carregada com sucesso")
    public void getContactPage() {
        contact = new ContactPage();

    }

    @And("informo a pergunta: {string} e clico em Pesquisar")
    public void setQuestion(String question) {
        contact.setQuestion(question);
        contact.searchClickOn();

    }

    @Then("abro a descrição da pergunta feita")
    public void descriptionClick() throws InterruptedException {
        contact.firstQuestionClickOn();

    }

    @And("efetuo like na resposta")
    public void setLike() throws InterruptedException {
        contact.like();

    }

    @And("Verifico a mensagem de exibida")
    public void getMessageSuccess() {
       Assert.assertEquals("Obrigado, iremos utilizar sua avaliação para melhorar nossas respostas.",contact.getMessageSucessLike());

    }
}
