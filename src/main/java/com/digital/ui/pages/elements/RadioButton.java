package com.digital.ui.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RadioButton extends BasePage {
    public SelenideElement yes = $x("(//div[@class='custom-control custom-radio custom-control-inline'])[1]");
    public SelenideElement impressive = $x("(//div[@class='custom-control custom-radio custom-control-inline'])[2]");
    public SelenideElement yesRadio = $(By.id("yesRadio"));
    public SelenideElement impressiveRadio = $(By.id("impressiveRadio"));

    public RadioButton selectYes(){
        selenideActions.click(yes);
        return this;
    }
    public RadioButton selectImpressive(){
        selenideActions.click(impressive);
        return  this;
    }
}
