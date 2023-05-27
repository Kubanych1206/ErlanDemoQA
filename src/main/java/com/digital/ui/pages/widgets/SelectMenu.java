package com.digital.ui.pages.widgets;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SelectMenu extends BasePage {
    public SelenideElement selectValue = $x("(//div[@class=' css-1hwfws3'])[1]");
    ElementsCollection listOfTitles = $$x("//div[@class=' css-yt9ioa-option']");
    public ElementsCollection listOfOptions = $$x("//div[@class=' css-yt9ioa-option']");
   public SelenideElement clickTitle = $x("(//div[@class=' css-1hwfws3'])[2]");

   public SelenideElement selectColor = $(By.id("oldSelectMenu"));
   public ElementsCollection listOfColors = $$x("//select[@id='oldSelectMenu']//option");
   public SelenideElement clickMultiColor = $x("(//div[@class=' css-1hwfws3'])[3]");
   public ElementsCollection multipleColorSelect = $$x("//div[contains(@id,'react-select-4')]");
   public SelenideElement selectCars = $x("//select[@id='cars']");







    public SelectMenu choseOption(){
        selenideActions.click(selectValue);
        for(SelenideElement el : listOfOptions) {
            if(el.getText().equalsIgnoreCase("A root option")) {
                el.click();
                break;
            }
        }
        return this;
    }


    public SelectMenu choseTitle(){
        selenideActions.click(clickTitle);
        for (SelenideElement elem : listOfTitles){
            if(elem.getText().equalsIgnoreCase("Mr.")){
                selenideActions.click(elem);
                break;
            }
        }
        return this;
    }

    public SelectMenu choseColorBySelect(){
  //      selectColor.selectOptionByValue("6");
        System.out.println("SelectListOf Colors " + listOfColors.size());
        for (SelenideElement el : listOfColors){
            String text = el.getText();
            if(text.equalsIgnoreCase("Green")) {
                el.click();
                break;
            }
        }

        return this;
    }

    public SelectMenu choseMultipleSelect(){
        selenideActions.click(clickMultiColor);
        for(SelenideElement el : multipleColorSelect){
            el.click();
        }
        return this;
    }

    public void selectCarMethod(){
        selectCars.selectOptionByValue("volvo");
    }




}
