package com.digital.ui.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TextBox extends BasePage {
    public SelenideElement fullName = $(By.id("userName"));
    public SelenideElement userEmail = $(By.id("userEmail"));
    public SelenideElement currentAddress = $x("//textarea[@id='currentAddress']");
    public SelenideElement permanentAddress = $x("//textarea[@id='permanentAddress']");
    public SelenideElement submitBtn = $x("//button[@id='submit']");

    ////////////// RESULT

    SelenideElement resultFullName = $(By.id("name"));

    SelenideElement resulEmail = $x("//p[@id='email']");
    SelenideElement resultCurrentAddress = $x("//p[@id='currentAddress']");
    SelenideElement resultPermanentAddress = $x("//p[@id='permanentAddress']");

    public TextBox enterFullName(String fullName){
        selenideActions.setValue(this.fullName, fullName);
        return this;
    }
    public TextBox enterEmail(String email){
        selenideActions.setValue(userEmail, email);
        return this;
    }
    public TextBox enterCurrentAddress(String currentAddr) {
        selenideActions.setValue(currentAddress, currentAddr);
        return this;
    }
    public TextBox enterPermanentAddress(String permanentAddr){
        selenideActions.setValue(permanentAddress, permanentAddr);
        return this;
    }
    public TextBox pressSubmitBtn(){
        selenideActions.click(submitBtn);
        return this;
    }





}
