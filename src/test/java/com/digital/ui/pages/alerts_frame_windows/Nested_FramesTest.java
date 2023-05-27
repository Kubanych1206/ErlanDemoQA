package com.digital.ui.pages.alerts_frame_windows;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static org.testng.Assert.*;

public class Nested_FramesTest extends BaseUiAlerts{
    @BeforeClass
    public void open(){
        Selenide.open("/nestedframes");
    }

    @Test
    public void frames(){
        nestedFrames.switchInToFrames();
        nestedFrames.childFrameText.shouldHave(Condition.text("Child Iframe"));
       // Assert.assertEquals(nestedFrames.childFrameText.getText(), "Child Iframe");
    }

}