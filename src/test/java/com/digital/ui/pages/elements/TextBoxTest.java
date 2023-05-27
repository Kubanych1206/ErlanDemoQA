package com.digital.ui.pages.elements;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;


public class TextBoxTest extends BaseUIElements {
    @BeforeMethod
    public void beforeMethod(){
        open("/text-box");
    }
    @Test(priority = 1)
    public void fillFullName(){
        textBox.enterFullName("John Doe")
                .enterEmail("john@gmail.com")
                .enterCurrentAddress("Wall 123")
                .enterPermanentAddress("Mira 555")
                .pressSubmitBtn();

        Assert.assertEquals(textBox.resultFullName.getText(), "Name:John Doe");
        System.out.println("works");
        Assert.assertEquals(textBox.resulEmail.getText(), "Email:john@gmail.com");
        System.out.println("works2");


    }







}