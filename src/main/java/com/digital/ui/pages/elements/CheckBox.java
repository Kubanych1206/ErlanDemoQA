package com.digital.ui.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class CheckBox extends BasePage {
    public SelenideElement downIcon = $x("(//button[@title='Toggle'])[1]");
    public SelenideElement downDesktop = $x("(//button[@title='Toggle'])[2]");
    public SelenideElement commands = $x("//label[@for='tree-node-commands']");
    public SelenideElement checkBoxElement = $x("//input[@id='tree-node-commands']");

    public CheckBox clickDown(){
        selenideActions.click(downIcon);
        return this;
    }
    public CheckBox clickDesktop(){
        selenideActions.click(downDesktop);
        return this;
    }
    public CheckBox clickCommands(){
        selenideActions.click(commands);
        return this;
    }

    public CheckBox open(){
        Selenide.open("https://demoqa.com/checkbox");
        return this;
    }

}
