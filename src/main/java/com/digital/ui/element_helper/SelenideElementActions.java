package com.digital.ui.element_helper;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.logging.Logger;

import static com.codeborne.selenide.Condition.visible;

public class SelenideElementActions {



    public SelenideElementActions click(SelenideElement element) {
        element.shouldBe(visible).scrollTo().click();
        return this;
    }

    public SelenideElementActions hover(SelenideElement element) {
        element.shouldBe(visible).hover();
        return this;
    }

    public SelenideElementActions setValue(SelenideElement element, String text){
        element.shouldBe(visible).setValue(text);
        return this;
    }
    public SelenideElementActions setValue(SelenideElement element, Integer text){
        element.shouldBe(visible).setValue(String.valueOf(text));
        return this;
    }


    public SelenideElementActions sendKeys(SelenideElement element, String text){
        element.shouldBe(visible).sendKeys(text);
        return this;
    }

    public String getText(SelenideElement element) {
        return element.shouldBe(visible).getText();
    }

    public String getValue(SelenideElement element) {
        return element.shouldBe(visible).getValue();
    }

    public SelenideElementActions selectOption(SelenideElement element, String text) {
        element.shouldBe(visible).scrollTo().selectOption(text);
        return this;
    }
    public SelenideElementActions selectOptions(SelenideElement element, List<String> texts) {
        element.shouldBe(visible).scrollTo().selectOption(texts.toString());
        return this;
    }

    public SelenideElementActions selectOption(SelenideElement element, int i) {
        element.shouldBe(visible).scrollTo().selectOption(i);
        return this;
    }

    public SelenideElementActions getSelectOption(SelenideElement element) {
        element.shouldBe(visible).scrollTo().getSelectedOption();
        return this;
    }

    public ElementsCollection getSelectOptions(SelenideElement element) {
        return  element.shouldBe(visible).scrollTo().getSelectedOptions();
    }

    public SelenideElementActions clear(SelenideElement element) {
        element.shouldBe(visible).clear();
        return this;
    }

    public SelenideElementActions pressEnter(SelenideElement element) {
        element.shouldBe(visible).pressEnter();
        return this;
    }
    public SelenideElementActions pressDownAndEnter(SelenideElement element) {
        element.shouldBe(visible).sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }
}
