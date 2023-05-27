package com.digital.ui.pages.alerts_frame_windows;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTest extends BaseUiAlerts {
    @BeforeClass
    public void open(){
        Selenide.open("/alerts");
    }
    @Test
    public void will5SecButton() throws InterruptedException {
        alerts.clickAlert();
        alerts.clickTimeAlert();
        alerts.confirmBtn();
        Thread.sleep(2000);
        alerts.promptBtn();
    }
}