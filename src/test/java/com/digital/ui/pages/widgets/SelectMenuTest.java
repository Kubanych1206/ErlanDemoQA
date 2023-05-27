package com.digital.ui.pages.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SelectMenuTest extends BaseUIWidgets {
    @BeforeClass
    public void open() {
        Selenide.open("/select-menu");
    }

    @Test
    public void clickOption() {
        selectMenu.choseOption()
                .choseTitle()
                .choseColorBySelect()
                .choseMultipleSelect()
                .selectCarMethod();

        selectMenu.selectValue.shouldHave(Condition.text("A root option"));
        selectMenu.clickTitle.shouldHave(Condition.text("Mr."));
        selectMenu.selectColor.shouldHave(Condition.text("Green"));

    }
}