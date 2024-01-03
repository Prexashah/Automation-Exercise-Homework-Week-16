package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewUserSignUpPAge extends Utility {

    //Element
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa = 'signup-name']")
    WebElement NewUserName;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa = 'signup-email']")
    WebElement NewUserEmail;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Signup']")
    WebElement signupButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(), 'Login to your account')]")
    WebElement LoginUserText;

    @CacheLookup
    @FindBy(xpath = "(//input[@placeholder = 'Email Address'])[1]")
    WebElement emailTOLoginYourAccount;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordToLoginYourAccount;

    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Login']")
    WebElement clickLoginBtnToLoginYourAccount;

    @CacheLookup
    @FindBy(xpath = "//p[text() = 'Your email or password is incorrect!'] ")
    WebElement verifyIncorrectEmailOrPasswordMSG;


    @CacheLookup
    @FindBy(xpath = "//p[text() = 'Email Address already exist!'] ")
    WebElement VerifyEmailExist;


    //Method
    public void enterName(String text) {

        sendTextToElement(NewUserName, text);
    }

    public void enterEmailAddress(String text) {
        sendTextToElement(NewUserEmail, text);
    }

    public void clickOnSignupButton() {
        waitUntilElimentIsClickable(signupButton, 5);
        clickOnElement(signupButton);
    }

    public String verifyLoginToYourAccountText() {
        return getTextFromElement(LoginUserText);
    }
    public void enterCorrectEmailToLoginYourAccount(String text){
        sendTextToElement(
                emailTOLoginYourAccount,text);
    }
    public void enterCorrectPasswordToLoginYourAccount(String text){
        sendTextToElement(passwordToLoginYourAccount,text);
    }
    public void clickOnLoginButtonToLoginYourAccount(){
        clickOnElement(clickLoginBtnToLoginYourAccount);

    }
    public String verifyYourEmailAndPasswordIsIncorrect(){
        return getTextFromElement(verifyIncorrectEmailOrPasswordMSG);
    }
    public String verifyEmailAlreadyExistText(){
        return getTextFromElement(VerifyEmailExist);
    }

}
