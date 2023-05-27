package com.digital.ui.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ButtonsTest extends BaseUIElements{

    @BeforeClass
    public void open(){
        Selenide.open("/alerts");
    }
    @Test
    public void will5SecButton() throws InterruptedException {
        buttons.clickAlert();
        buttons.clickTimeAlert();
        buttons.confirmBtn();
        Thread.sleep(2000);
        buttons.promptBtn();
    }

}