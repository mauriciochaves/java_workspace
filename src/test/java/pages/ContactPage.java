package pages;

import org.openqa.selenium.By;

public class ContactPage extends BasePage {

    private By tx_search = By.id("query");
    private By btn_search = By.className("search-button");
    private By btn_first_question = By.cssSelector("#article:nth-child(1)"); //div[data-text-articleid='41']
    private By btn_like = By.cssSelector("#article:nth-child(1) a[data-feedback='yes']");
    private By lbl_message_sucess_like = By.cssSelector(".feedback-content.yes p");

    public void setQuestion(String question){
        send(tx_search, question, true);

    }

    public void searchClickOn(){
        click(btn_search);

    }

    public void firstQuestionClickOn() {
        loading(3);
        click(btn_first_question);
    }

    public void like() {
        loading(2);
        click(btn_like);
    }

    public String getMessageSucessLike(){
        return text(lbl_message_sucess_like);
    }

}
