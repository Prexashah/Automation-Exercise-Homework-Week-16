package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomeProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//a[text() ='View Product'])[1]")
    WebElement clickOnViewProduct;

    @CacheLookup
    @FindBy(id = "quantity")
    WebElement changeTheQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//a//u[text() = 'View Cart']")
    WebElement clickOnViewCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_quantity']")
    WebElement newQuantity;

    public void clickAnyViewProductOnHomePage(){
        clickOnElement(clickOnViewProduct);
    }
    public void changeQuantity(){
        changeQuantity(changeTheQuantity);

    }
public void sendNewQuantity(String text){
        sendTextToElement(changeTheQuantity,text);
}
public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
}
public void clickOnViewCartLink(){
        clickOnElement(clickOnViewCart);
}
public String verifyCartWithNewQuantity(){
        return getTextFromElement(newQuantity);
}


}
