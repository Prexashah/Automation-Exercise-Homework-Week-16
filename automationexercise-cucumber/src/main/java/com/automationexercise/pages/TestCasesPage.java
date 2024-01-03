package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {

    //Element

    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'title text-center']//child::b")
    WebElement verifyTextTestCases;

    public String verifyTextTestCases(){
        return getTextFromElement(verifyTextTestCases);
    }




}
