package com.digital.ui.pages.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class WebTables extends BasePage {
    public SelenideElement addUserBtn = $(By.id("addNewRecordButton"));
    public SelenideElement firstName = $(By.id("firstName"));
    public SelenideElement lastName = $(By.id("lastName"));

    public SelenideElement email = $(By.id("userEmail"));
    public SelenideElement age = $(By.id("age"));
    public SelenideElement salary = $(By.id("salary"));
    public SelenideElement department = $(By.id("department"));
    public SelenideElement submit = $(By.id("submit"));


    ///////////////////////////////////////


    public WebTables clickAddUser(){
        selenideActions.click(addUserBtn);
        return this;
    }

    public WebTables addFirstName(String name){
        selenideActions.setValue(firstName, name);
        return this;
    }
    public WebTables addLastName(String lastName){
        selenideActions.setValue(this.lastName, lastName);
        return this;
    }
    public WebTables addEmail(String email){
        selenideActions.setValue(this.email, email);
        return this;
    }
    public WebTables addAge(Integer age){
        selenideActions.setValue(this.age, age);
        return this;
    }
    public WebTables addSalary(Integer salary){
        selenideActions.setValue(this.salary, salary);
        return this;
    }
    public WebTables addDepartment(String department){
        selenideActions.setValue(this.department, department);
        return this;
    }

    public WebTables clickSubmitBtn(){
        selenideActions.click(submit);
        return this;
    }




}
