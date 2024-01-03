package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Women - Dress Products']")
    WebElement titleTextONWomenPage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(@href,'Men')]")
    WebElement clickOnMenLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(@href,'6') and text() = 'Jeans ']")
    WebElement clickOnMenSubLink;

    public String verifyTitleOnWomenPage(){
        return getTextFromElement(titleTextONWomenPage);
    }
    public void clickOnMENLink(){
        clickOnElement(clickOnMenLink);
    }
    public void clickOnMenSubLink(){
        clickOnElement(clickOnMenSubLink);
    }
}
