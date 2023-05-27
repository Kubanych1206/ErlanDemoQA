package com.digital.ui.pages.widgets;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProgressBar extends BasePage {
    public SelenideElement startStopBtn = $(By.id("startStopButton"));


    public ProgressBar startProgress(int value){
        Selenide.open("/progress-bar");
        startStopBtn.click();
        boolean bool = true;
        while(bool) {
            SelenideElement loadLine = $x("//div[@class='progress-bar bg-info']");
            int valueInt = Integer.parseInt(loadLine.getAttribute("aria-valuenow"));
             if(valueInt == value) {
                 startStopBtn.click();
                 bool = false;
                 System.out.println(loadLine.getText());
                 break;
             }
        }
        return this;
    }


//    public void progressLine(String stopNumber){
//        selenideActions.click(startStopBtn);
//        int intStopNumber = Integer.parseInt(stopNumber);
//        String value = loadLine.getAttribute("aria-valuenow");
//        int intValue = Integer.parseInt(value);
//        if(intStopNumber == intValue) {
//            startStopBtn.click();
//        }
//    }
}
