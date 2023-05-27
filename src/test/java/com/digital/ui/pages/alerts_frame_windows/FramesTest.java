package com.digital.ui.pages.alerts_frame_windows;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.*;

public class FramesTest extends BaseUiAlerts{

    @BeforeClass
    public void open(){
        Selenide.open("/frames");
    }
    SelenideElement frameText = $(By.id("sampleHeading"));
    @Test
    public void goToFrame(){
        frames.switchToIframe();

          frameText.shouldHave(Condition.ownText("This is a sample page"));
          frameText.shouldHave(text("This is a sample page"));
          Assert.assertEquals(frameText.getText(), "This is a sample page");
    }
}