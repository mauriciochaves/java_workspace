import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/resources/features"},
        glue= {"stepDefinitions"},
        tags = {"@projeto_final"})

//AND tags = {"@tag1", "@tag2"}
//OR tags = {"@tag1, @tag2"}
//NOT tags = {"~@tag1"}

public class Runner {

}
