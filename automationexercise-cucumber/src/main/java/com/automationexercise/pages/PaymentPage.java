package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {

    //Elements
    @CacheLookup
    @FindBy(name = "name_on_card")
    WebElement enterNameOnTheCard;

    @CacheLookup
    @FindBy(name = "card_number")
    WebElement enterCardNumber;
    @CacheLookup
    @FindBy(name = "cvc")
    WebElement enterCVV;

    @CacheLookup
    @FindBy(name = "expiry_month")
    WebElement expiryMonth;

    @CacheLookup
    @FindBy(name = "expiry_year")
    WebElement expiryYear;

    @CacheLookup
    @FindBy(id = "submit")
    WebElement placeAnOrder;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'alert-success alert'])[1]")
    WebElement verifyOrderSuccessText;

    public void enterNameOnTheCard(String text) {
        sendTextToElement(enterNameOnTheCard, text);

    }

    public void enterCardNumber(String text) {
        sendTextToElement(enterCardNumber, text);

    }

    public void enterCardCVV(String text) {
        sendTextToElement(enterCVV, text);

    }

    public void enterExpiryMonth(String text) {
        sendTextToElement(expiryMonth, text);

    }

    public void enterExpiryYear(String text) {
        sendTextToElement(expiryYear, text);

    }

    public void userClickOnPlaceOrder() {
        clickOnElement(placeAnOrder);

    }
    public String verifyTheTextYourOrderHasBeenPlacedSuccessfully(){
        return getTextFromElement(verifyOrderSuccessText);
    }

}
