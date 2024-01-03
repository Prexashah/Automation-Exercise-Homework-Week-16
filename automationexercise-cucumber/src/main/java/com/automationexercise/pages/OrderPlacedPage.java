package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OrderPlacedPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[text() ='Download Invoice']")
    WebElement downLoadInVoice;


    public void downloadInvoice(){
        clickOnElement(downLoadInVoice);
    }
}
