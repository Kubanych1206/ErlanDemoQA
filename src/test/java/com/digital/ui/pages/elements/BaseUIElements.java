package com.digital.ui.pages.elements;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import com.digital.ui.element_helper.SelenideElementActions;
import com.digital.ui.pages.alerts_frame_windows.Alerts;
import com.digital.ui.pages.widgets.ProgressBar;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({SoftAsserts.class, ScreenShooter.class})
public class BaseUIElements {
    SelenideElementActions selenideActions = new SelenideElementActions();
    TextBox textBox = new TextBox();
    Alerts buttons = new Alerts();
    CheckBox checkBox = new CheckBox();
    Links links = new Links();
    RadioButton radioButton = new RadioButton();
    WebTables webTables = new WebTables();

    public ProgressBar progressBar = new ProgressBar();

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
