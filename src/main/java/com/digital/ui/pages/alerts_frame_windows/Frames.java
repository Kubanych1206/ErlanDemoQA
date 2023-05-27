package com.digital.ui.pages.alerts_frame_windows;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Frames extends BasePage {

    public void switchToIframe(){
        Selenide.switchTo().frame("frame1");


    }
}
