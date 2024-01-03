package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(id = "product-1")
    List<WebElement>  firstProductDetails;

    @CacheLookup
    @FindBy(id = "product-2")
    List<WebElement>  secondProductDetails;

    @CacheLookup
    @FindBy(xpath = "//li[text() = 'Shopping Cart']")
    WebElement shoppingCartMessage;

    @CacheLookup
    @FindBy(xpath = "//a[text() = 'Proceed To Checkout']")
    WebElement proceedToCheckOutButton;
    @CacheLookup
    @FindBy(xpath = "//a[text() = 'Proceed To Checkout']")
    WebElement registerLoginButton;

    @CacheLookup
    @FindBy(xpath = "//a[@class = 'cart_quantity_delete']")
    WebElement clickOnXButtonToRemove;

    @CacheLookup
    @FindBy(xpath = "(//p[@class = 'text-center'])[3]")
    WebElement cartIsEmptyText;



    public void verifyFirstProductDetails(){

    }
    public String verifyShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
public void clickOnProceedToCheckOutButton(){
        clickOnElement(proceedToCheckOutButton);
}
public void clickOnRegisterLoginButtonFromPopup(){
        clickOnElement(registerLoginButton);
}

public void clickOnXButtonToRemoveProductFromCart(){
        clickOnElement(clickOnXButtonToRemove);
}
public String verifyThatCartIsEmptyText(){
        return getTextFromElement(cartIsEmptyText);
}

}

