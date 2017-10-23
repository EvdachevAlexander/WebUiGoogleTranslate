package WebUiTranslate.steps;

import WebUiTranslate.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    private UserSteps userSteps;

    @Given("the user is on the Google translate homepage")
    public void givenTheUserIsOnTheGoogleTranslateHomePage() {
        userSteps.is_the_page();
    }

    @When("the user enter up the definition of the word '$word'")
    public void whenTheUserEnterUpTheDefinitionOfTheWord(String word) {
        userSteps.enters(word);
    }

    @Then("he should see the word '$word'")
    public void thenHeShouldSeeTheWord(String word) {
        userSteps.should_see_word(word);
    }
}