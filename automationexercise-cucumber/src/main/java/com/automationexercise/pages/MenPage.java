package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Men - Jeans Products']")
    WebElement verifyTheTitle;

    public String verifyTheTitleOfMenCategory(){
        return getTextFromElement(verifyTheTitle);
    }

}
