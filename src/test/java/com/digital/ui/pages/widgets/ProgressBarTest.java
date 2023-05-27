package com.digital.ui.pages.widgets;

import com.codeborne.selenide.Selenide;
import com.digital.ui.pages.elements.BaseUIElements;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProgressBarTest extends BaseUIElements {

//  @BeforeClass
//    public void open(){
//      Selenide.open("/progress-bar");
//  }

    @Test
  public void checkProgress(){
      progressBar.startProgress(88);
    }
}