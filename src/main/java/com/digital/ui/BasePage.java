package com.digital.ui;

import com.digital.ui.element_helper.SelenideElementActions;
import com.digital.ui.element_helper.WebElementActions;

public abstract class BasePage {
   public WebElementActions elementActions = new WebElementActions();
   public SelenideElementActions selenideActions = new SelenideElementActions();

    public BasePage(){

    }
}
