package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    //Elements
    @CacheLookup
    @FindBy(xpath = "//a[text() = ' Signup / Login']")
    WebElement signupLoginLink;//same link use for verify and also for clicking

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'New User Signup!']")
    WebElement newUserText;

    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-user']//parent::a")
    WebElement userLoggedIN;

    @CacheLookup
    @FindBy(xpath = "//i[@class ='fa fa-trash-o']")
    WebElement deleteAccountLink;

    @CacheLookup
    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    WebElement accountDeletedHeading;

    @CacheLookup
    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    WebElement clickOnContinueButtonAccountDelete;

    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-lock']//parent:: a")
    WebElement logOutButton;

    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-envelope']//parent::a")
    WebElement contactusBtn;

    @CacheLookup
    @FindBy(xpath = "//a[text() = ' Test Cases']//parent::a")
    WebElement testCasesLink;

    @CacheLookup
    @FindBy(xpath = "//a[text() = ' Products']")
    WebElement productLink;

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement enterEmailForSubscription;

    @CacheLookup
    @FindBy(id = "subscribe")
    WebElement clickAfterEnteringEmail;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'alert-success alert']")
    WebElement successMessageAfterSubscribe;

    @CacheLookup
    @FindBy(xpath = "//a[text() = ' Cart']")
    WebElement clickOnCartBTN;

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Category']")
    WebElement verifyTextCategory;

    @CacheLookup
    @FindBy(xpath = "//a[contains(@href ,'Women')]")
    WebElement clickOnWomenCategory;

    @CacheLookup
    @FindBy(xpath = "(//a[text() = 'Dress '])[1]")
    WebElement clickOnWomenSubcategory;

    @CacheLookup
    @FindBy(xpath = "//h2[text() ='Brands']")
    WebElement verifyBrandText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(@href, '/brand_products/Polo')]")
    WebElement clickOnAnyBrandLink;

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'recommended items']")
    WebElement verifyRecommendedItemsText;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product-id = '1'][text() = 'Add to cart']")
    WebElement addToCartFromRecommendedItems;

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Full-Fledged practice website for Automation Engineers']")
    WebElement verifyAutomationEngineersText;







    //methods


    public boolean isHomePageVisible() {
        System.out.println("current URL" + driver.getCurrentUrl());
        System.out.println("sign up link visible" + signupLoginLink.isDisplayed());
        return driver.getCurrentUrl().equals("https://www.automationexercise.com/") && signupLoginLink.isDisplayed();

    }

    public void launchBrowser() {
        driver.get("https://www.automationexercise.com/");
    }

    public void clickOnSignupLoginLink() {
        mouseHoverToElementAndClick(signupLoginLink);
    }

    public String verifyNewUserText() {
        return getTextFromElement(newUserText);
    }

    public String verifyThatUserLoggedIN() {
        return getTextFromElement(userLoggedIN);
    }

    public void clickOnDeleteAccountButton() {
        clickOnElement(deleteAccountLink);
    }

    public String verifyAccountDeleted() {
        return getTextFromElement(accountDeletedHeading);
    }

    public void clickOnContinueBtnAfterAccountDeleted() {

        clickOnElement(clickOnContinueButtonAccountDelete);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logOutButton);
    }

    public void clickOnContactusButton() {
        clickOnElement(contactusBtn);

    }

    public void clickOnTestCasesLink() {
        clickOnElement(testCasesLink);

    }

    public void clickOnProductButton() {
        clickOnElement(productLink);
    }

    public void scrollDownToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight", " ");
    }

    public String verifyTheTextSubscription() {
        return getTextFromElement(subscriptionText);
    }

    public void enterEmailForSubscription(String text) {
        sendTextToElement(enterEmailForSubscription, text);

    }

    public void clickOnSubscriptionBtn() {
        clickOnElement(clickAfterEnteringEmail);
    }
    public String verifySuccessMessageAfterSubscription() {
        return getTextFromElement(successMessageAfterSubscribe);
    }
    public void clickOnCartButton(){
        clickOnElement(clickOnCartBTN);
    }
    public String verifyTextCategory(){
        return getTextFromElement(verifyTextCategory);
    }
    public void clickOnWomenLink(){
        clickOnElement(clickOnWomenCategory);

    }
    public void clickOnWomenSubLinkDress(){
        clickOnElement(clickOnWomenSubcategory);
    }
    public String verifyBrandTextIsDisplayed(){
        return getTextFromElement(verifyBrandText);

    }
    public void clickOnAnyBrandUnderBrands(){
        clickOnElement(clickOnAnyBrandLink);
    }

    public String verifyTextRecommendedItems(){
        return getTextFromElement(verifyRecommendedItemsText);

    }
    public void clickOnAddToCartFromRecommendedItems(){
        clickOnElement(addToCartFromRecommendedItems);
    }
    public String verifyTextAutomationEngineers(){
        return getTextFromElement(verifyAutomationEngineersText);
    }


}
