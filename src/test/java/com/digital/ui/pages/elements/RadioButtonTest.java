package com.digital.ui.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class RadioButtonTest extends BaseUIElements {
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open("/radio-button");
    }

    @Test
    public void yes() throws InterruptedException {
        radioButton.selectYes();
        Thread.sleep(2000);
        Assert.assertTrue(radioButton.yesRadio.isSelected());
    }

    @Test
    public void impressive(){
        radioButton.selectImpressive();
        Assert.assertTrue(radioButton.impressiveRadio.isSelected());
    }
}