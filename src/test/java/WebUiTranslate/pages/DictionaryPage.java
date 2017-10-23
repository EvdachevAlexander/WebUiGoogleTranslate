package WebUiTranslate.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://translate.google.ru/")
public class DictionaryPage extends PageObject {

    @FindBy(name="text")
    private WebElementFacade source;

    public void enter_keywords(String keyword) {
        source.type(keyword);
    }

    public String search_keywords() {
        return source.getValue();
    }
}