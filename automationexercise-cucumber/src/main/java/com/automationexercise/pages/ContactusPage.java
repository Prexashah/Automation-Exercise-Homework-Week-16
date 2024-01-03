package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactusPage extends Utility {

    //Elements
    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Get In Touch']")
    WebElement verifyGetInTouchText;

    @CacheLookup
    @FindBy(xpath = "//input[@name = 'name']")
    WebElement enterName;
    @CacheLookup
    @FindBy(xpath = "//input[@type = 'email']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@name = 'subject']")
    WebElement enterSubject;

    @CacheLookup
    @FindBy(id = "message")
    WebElement enterMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@name = 'upload_file']")
    WebElement uploadFile;

    @CacheLookup
    @FindBy(name = "submit")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'status alert alert-success']" )
    WebElement detailsSubmittedSuccessfullyMSG;

    @CacheLookup
    @FindBy(xpath = "//a[@class = 'btn btn-success']" )
    WebElement clickOnHomeBTN;



    //Methods
    public String verifyGetInTouchText(){
        return getTextFromElement(verifyGetInTouchText);
    }
    public void enterName(String text){
        sendTextToElement(enterName,text);
    }
    public void enterEmail(String text){
        sendTextToElement(enterEmail,text);
    }
    public void enterSubject(String text){
        sendTextToElement(enterSubject,text);
    }

    public void enterMessage(String text){
        sendTextToElement(enterMessage,text);
    }
    public void clickOnUploadFile(String filePath){
        sendTextToElement(uploadFile,filePath);

    }
    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }
    public void handlePopUPAfterSubmit(){
        acceptAlert();
    }
    public String verifyYourDetailsHaveBeenSubmittedSuccessfully(){
        return getTextFromElement(detailsSubmittedSuccessfullyMSG);
    }
    public void clickOnHomeButton(){
        clickOnElement(clickOnHomeBTN);
    }


}
