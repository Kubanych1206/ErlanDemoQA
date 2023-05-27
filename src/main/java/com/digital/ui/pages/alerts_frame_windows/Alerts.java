package com.digital.ui.pages.alerts_frame_windows;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

import static com.codeborne.selenide.Selenide.$;

public class Alerts extends BasePage {
    public SelenideElement alertBtn = $(By.id("alertButton"));
    public SelenideElement timeAlertBtn = $(By.id("timerAlertButton"));
    public SelenideElement confirmAlertBtn = $(By.id("confirmButton"));
    public SelenideElement promptBtn = $(By.id("promtButton"));

    public void clickAlert() throws InterruptedException {
        selenideActions.click(alertBtn);
        try {
            Selenide.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
    }
    public void clickTimeAlert(){
        selenideActions.click(timeAlertBtn);
        Selenide.switchTo().alert().accept();
    }

    public void confirmBtn(){
        selenideActions.click(confirmAlertBtn);
        Selenide.switchTo().alert().dismiss();
    }

    public void promptBtn(){
        selenideActions.click(promptBtn);
        Selenide.switchTo().alert().sendKeys("Kubanych");
        Selenide.switchTo().alert().accept();
    }
}
