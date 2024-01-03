package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[text() ='Address Details']")
    WebElement verifyAddressDetail;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'step-one'])[1]")
    WebElement verifyTextReviewOrder;

    @CacheLookup
    @FindBy(name = "message")
    WebElement enterComment;

    @CacheLookup
    @FindBy(xpath = "//a[text() = 'Place Order']")
    WebElement placeOrderButton;

    public String verifyTitleAddressDetails() {
        return getTextFromElement(verifyAddressDetail);
    }

    public String verifyTextReviewOrder() {
        return getTextFromElement(verifyTextReviewOrder);
    }
    public void enterCommentInTheBox(String text){
        sendTextToElement(enterComment,text);

    }
    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButton);

    }


}
