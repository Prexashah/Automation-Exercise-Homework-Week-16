package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends Utility {
    //elements
    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'title text-center']")
    WebElement accountCreated;
    @CacheLookup
    @FindBy(xpath = "//a[@class = 'btn btn-primary']")
    WebElement continueButton;




    //Methods
    public String verifyTextAccountCreated(){
       return getTextFromElement(accountCreated);
    }
    public void clickOnContinueButton(){

    }
}
