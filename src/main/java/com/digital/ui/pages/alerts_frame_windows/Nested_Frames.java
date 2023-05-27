package com.digital.ui.pages.alerts_frame_windows;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class Nested_Frames extends BasePage {
    SelenideElement childFrameText = $x("//p[text()='Child Iframe']");

    public void switchInToFrames(){
        Selenide.switchTo().frame("frame1").switchTo();
        Selenide.switchTo().frame($x("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        System.out.println(childFrameText.getText());
    }
}
