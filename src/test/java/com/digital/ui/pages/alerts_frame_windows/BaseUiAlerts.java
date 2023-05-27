package com.digital.ui.pages.alerts_frame_windows;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import com.digital.ui.element_helper.SelenideElementActions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({SoftAsserts.class, ScreenShooter.class})
public abstract class BaseUiAlerts {
    SelenideElementActions selenideActions = new SelenideElementActions();
    Alerts alerts = new Alerts();
    Browser_Windows browserWindows = new Browser_Windows();
    Frames frames = new Frames();
    Modal_Dialoqs modalDialoqs = new Modal_Dialoqs();
    Nested_Frames nestedFrames = new Nested_Frames();
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
