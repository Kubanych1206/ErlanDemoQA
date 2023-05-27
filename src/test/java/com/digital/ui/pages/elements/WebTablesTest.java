package com.digital.ui.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static org.testng.Assert.*;

public class WebTablesTest extends BaseUIElements{
    @BeforeClass
    public void beforeMethod(){
        Selenide.open("/webtables");
    }

    @Test(priority = 1)
    public void addUser1(){
        webTables.clickAddUser()
        .addFirstName("Kubanych")
                .addLastName("Tashbaev")
                .addAge(33)
                .addEmail("kuba@gmail.com")
                .addSalary(5000)
                .addDepartment("QA")
                .clickSubmitBtn();
    }

    @Test(priority = 2)
    public void addUser2(){
        webTables.clickAddUser()
        .addFirstName("Asan")
                .addLastName("Usenov")
                .addAge(30)
                .addEmail("usen@gmail.com")
                .addSalary(6000)
                .addDepartment("DEV")
                .clickSubmitBtn();
    }

    ElementsCollection listOfNames = $$x("//div[@class='rt-td'][1]");
    SelenideElement editKubanych = $x("//span[@id='edit-record-4']");
    SelenideElement deleteBtn = $x("//span[@id='delete-record-5']");


    @Test(priority = 3)
    public void listOfNames(){
        boolean status = false;
        for(SelenideElement e : listOfNames) {
            String value = e.getText();
            if(value.equalsIgnoreCase("Kubanych")){
                status = true;
                break;
            }
        }
        Assert.assertTrue(status);
    }
    @Test(priority = 4)
    public void editUser(){
        selenideActions.click(editKubanych);
        webTables.salary.setValue(String.valueOf(6000));
        webTables.clickSubmitBtn();

    }

    @Test(priority = 5)
    public void deleteUser(){
        selenideActions.click(deleteBtn);
        boolean status = true;
        for(SelenideElement el : listOfNames){
            System.out.println(el.getText());
        }
    }
}