package com.digital.ui.pages.widgets;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import com.digital.ui.element_helper.SelenideElementActions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({SoftAsserts.class, ScreenShooter.class})
public abstract class BaseUIWidgets {
    SelenideElementActions selenideActions = new SelenideElementActions();
    Accordian accordian = new Accordian();
    Autocomplete autocomplete = new Autocomplete();
    Data_Picker dataPicker = new Data_Picker();
    Menu menu = new Menu();
    ProgressBar progressBar = new ProgressBar();
    SelectMenu selectMenu = new SelectMenu();
    Slider slider = new Slider();
    Tabs tabs = new Tabs();
    ToolTips toolTips = new ToolTips();

    @BeforeClass
    public void setUp(){
        Configuration.timeout = 8000;
        Configuration.pageLoadStrategy = "normal";
        Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.screenshots = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
}
