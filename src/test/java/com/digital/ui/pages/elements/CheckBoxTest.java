package com.digital.ui.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static java.nio.channels.SocketChannel.open;
import static org.testng.Assert.*;

public class CheckBoxTest extends BaseUIElements{
        @BeforeMethod
        public void BeforeMethod(){
            Selenide.open("/checkbox");
        }

        @Test
        public void isChecked(){
            checkBox.open()
                    .clickDown()
                    .clickDesktop()
                    .clickCommands();
            Assert.assertTrue(checkBox.checkBoxElement.isSelected());
        }
}