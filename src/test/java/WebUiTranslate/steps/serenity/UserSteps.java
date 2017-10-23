package WebUiTranslate.steps.serenity;

import WebUiTranslate.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class UserSteps {

    private DictionaryPage dictionaryPage;

    @Step
    public void is_the_page() {
        dictionaryPage.open();
    }

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void should_see_word(String keywords) {
        assertThat(dictionaryPage.search_keywords(),containsString(keywords));
    }
}