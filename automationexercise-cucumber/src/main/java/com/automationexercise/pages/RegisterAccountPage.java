package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterAccountPage extends Utility {

    //Elements
    @CacheLookup
    @FindBy(xpath = "//b[text() = 'Enter Account Information']")
    WebElement enterAccountInformationTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='clearfix']/div[@class='radio-inline']//span/input")
    List<WebElement> selectTitleRadioBtn;
    @CacheLookup
    @FindBy(id = "password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "days")
    WebElement dayFromDateOFBirth;

    @CacheLookup
    @FindBy(id = "months")
    WebElement monthFromDateOFBirth;
    @CacheLookup
    @FindBy(id = "years")
    WebElement yearFromDateOFBirth;
    @CacheLookup
    @FindBy(xpath = "//label[text() = 'Sign up for our newsletter!']")
    WebElement newsletterCheckbox;

    @CacheLookup
    @FindBy(xpath = "//label[text() = 'Receive special offers from our partners!']")
    WebElement specialOfferFromPartners;
    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "company")
    WebElement companyName;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1;
    @CacheLookup
    @FindBy(id = "address2")
    WebElement address2;

    @CacheLookup
    @FindBy(id = "country")
    WebElement country;

    @CacheLookup
    @FindBy(id = "state")
    WebElement state;

    @CacheLookup
    @FindBy(id = "city")
    WebElement city;
    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipCode;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobile;

    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Create Account']")
    WebElement createAccountBtn;

    //Methods

    public String verifyEnterAccountInformation() {
        return getTextFromElement(enterAccountInformationTitle);
    }

    public void selectTitle(String text) {
        for (WebElement radioButton : selectTitleRadioBtn) {
            if (radioButton.getAttribute("value").contains(text)) {
                radioButton.click();
                break;
            }
        }
    }


    public void enterPassword(String text) {
        sendTextToElement(password, text);

    }

    public void selectDayFromDateOfBirth(String text) {
        selectByVisibleTextFromDropDown(dayFromDateOFBirth, text);
    }

    public void selectMonthFromDateOfBirth(String text) {
        selectByVisibleTextFromDropDown(monthFromDateOFBirth, text);
    }

    public void selectYearFromDateOfBirth(String text) {
        selectByVisibleTextFromDropDown(yearFromDateOFBirth, text);
    }

    public void selectSignUpForOurNewsLetter() {
        waitUntilVisibilityOfElementLocated(newsletterCheckbox,5);
        clickOnElement(newsletterCheckbox);

    }

    public void selectReceiveASpecialOfferFromOurPartners() {
        clickOnElement(specialOfferFromPartners);

    }

    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);

    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void enterCompanyName(String text) {
        sendTextToElement(companyName, text);
    }
    public void enterFirstLineAddress(String text) {
        sendTextToElement(address1, text);
    }
    public void enterSecondLineAddress(String text) {
        sendTextToElement(address2, text);
    }
    public void selectCountryFromDropDown(String text){
        selectByVisibleTextFromDropDown(country,text);

    }
    public void enterStateName(String text){
        sendTextToElement(state,text);
    }
    public void enterCityName(String text){
        sendTextToElement(city,text);
    }
    public void enterZipcode(String text){
        sendTextToElement(zipCode,text);
    }
    public void enterMobileNumber(String text){
        sendTextToElement(mobile,text);
    }
    public void clickOnCreateAccountBtn(){
        clickOnElement(createAccountBtn);
    }

}