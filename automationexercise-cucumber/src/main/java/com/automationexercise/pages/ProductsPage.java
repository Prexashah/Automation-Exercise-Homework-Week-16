package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'All Products']")
    WebElement verifyTextAllProduct;

    @CacheLookup
    @FindBy(xpath = "(//a[text() = 'View Product'])[1]")
    WebElement clickOnFirstViewProduct;

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Blue Top']")
    WebElement verifyFirstProductName;
    @CacheLookup
    @FindBy(xpath = "//p[text() = 'Category: Women > Tops']")
    WebElement verifyFirstProductCategory;
    @CacheLookup
    @FindBy(xpath = "//span[text() = 'Rs. 500']")
    WebElement verifyFirstProductPrice;
    @CacheLookup
    @FindBy(xpath = "//*[text() = 'Availability:']//parent:: p")
    WebElement verifyFirstProductAvailability;
    @CacheLookup
    @FindBy(xpath = "//*[text() = 'Condition:']//parent::p")
    WebElement verifyFirstProductCondition;
    @CacheLookup
    @FindBy(xpath = "//*[text() = 'Brand:']//parent::p")
    WebElement verifyFirstProductBrand;

    @CacheLookup
    @FindBy(id = "search_product")
    WebElement searchbar;

    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement clickOnSearch;

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Searched Products']")
    WebElement verifySearchedProducts;

    @CacheLookup
    @FindBy(xpath = "//div[@class ='features_items']//div[@class = 'product-image-wrapper']")
    List<WebElement> allRelatedProductIsVisible;

    @CacheLookup
    @FindBy(xpath = "(//a[@data-product-id = '1'])[1]")
    WebElement addFirstProductToCart;
    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Continue Shopping']")
    WebElement clickOnContinueShoppingBtn;

    @CacheLookup
    @FindBy(xpath = "(//a[@data-product-id = '1'])[2]")
    WebElement addSecondProductToCart;

    @CacheLookup
    @FindBy(xpath = "//a//u[text() = 'View Cart']")
    WebElement clickOnViewCart;

    @CacheLookup
    @FindBy(xpath = "//h2[text() ='Brand - Polo Products']")
    WebElement verifyPOLOBrandText;

    @CacheLookup
    @FindBy(xpath = "//a[@href = '/brand_products/Biba']")
    WebElement clickOnBIBABrand;

    @CacheLookup
    @FindBy(xpath = "//h2[text() ='Brand - Biba Products']")
    WebElement verifyBiBaBrandText;

    @CacheLookup
    @FindBy(xpath = "//a[@class = 'btn btn-default add-to-cart'] [text() = 'Add to cart']")
    List<WebElement> addAllTheProductToTheCart;

    @CacheLookup
    @FindBy(xpath = "//a[text() = 'Write Your Review']")
    WebElement verifyWriteYourReview;


    @CacheLookup
    @FindBy(id = "name")
    WebElement enterNameForReview;
    @CacheLookup
    @FindBy(id = "email")
    WebElement enterEmailForReview;
    @CacheLookup
    @FindBy(id = "review")
    WebElement enterTextForReview;

    @CacheLookup
    @FindBy(id = "button-review")
    WebElement clickOnSubmit;



    @CacheLookup
    @FindBy(id = " review-section")
    WebElement thankYouForReviewText;



    public String verifyTextAllProducts() {
        return getTextFromElement(verifyTextAllProduct);
    }

    public void clickOnFirstViewProduct() {
        clickOnElement(clickOnFirstViewProduct);
    }

    //    public String getProductName(){
//       return getTextFromElement(verifyFirstProductName);
//    }
    public boolean verifyFirstProductName(String s) {
        String actualProductName = getTextFromElement(verifyFirstProductName);
        return s.equalsIgnoreCase(actualProductName); //returns boolean

    }

    public boolean verifyFirstProductCategory(String s) {
        String actualProductCategory = getTextFromElement(verifyFirstProductCategory);
        return s.equalsIgnoreCase(actualProductCategory);

    }

    public boolean verifyFirstProductPrice(String s) {
        String actualProductPrice = getTextFromElement(verifyFirstProductPrice);
        return s.equalsIgnoreCase(actualProductPrice);

    }

    public boolean verifyFirstProductAvailability(String s) {
        String productAvailability = getTextFromElement(verifyFirstProductAvailability);
        return s.equalsIgnoreCase(productAvailability);

    }

    public boolean verifyFirstProductCondition(String s) {
        String actualProductCondition = getTextFromElement(verifyFirstProductCondition);
        return s.equalsIgnoreCase(actualProductCondition);

    }

    public boolean verifyFirstProductBrand(String s) {
        String actualProductBrand = getTextFromElement(verifyFirstProductBrand);
        return s.equalsIgnoreCase(actualProductBrand);
    }

    public void sendProductNameOnSearchbar(String text) {
        sendTextToElement(searchbar, text);
    }

    public void clickOnSearchBar() {
        clickOnElement(clickOnSearch);
    }

    public String verifyTitleSearchedProducts() {
        return getTextFromElement(verifySearchedProducts);
    }

    public int areProductsDisplayed() {

        return allRelatedProductIsVisible.size();
    }

    public void addFirstProductToCart(){
        clickOnElement(addFirstProductToCart);
    }
    public void clickOnContinueShoppingButton(){
        clickOnElement(clickOnContinueShoppingBtn);
    }
    public void addSecondProductToCart(){
        clickOnElement(addSecondProductToCart);
    }
    public void clickOnViewCartButton(){
        clickOnElement(clickOnViewCart);

    }
    public String verifyPoloBrandText(){
        return getTextFromElement(verifyPOLOBrandText);
    }
    public void clickOnAnotherBrandBiba(){
        clickOnElement(clickOnBIBABrand);
    }
    public String verifyBibaBrandText(){
        return getTextFromElement(verifyBiBaBrandText);
    }
   // public void addAllTheProductsToTheCart(){

    //}
    public String verifyTextWriteYourReview(){
        return getTextFromElement(verifyWriteYourReview);
    }
    public void enterNameForReview(String text){
        sendTextToElement(enterNameForReview,text);
    }
    public void enterEmailForReview(String text){
        sendTextToElement(enterEmailForReview,text);
    }
    public void enterTextForReview(String text){
        sendTextToElement(enterTextForReview,text);
    }
    public void clickOnSubmitBtnToSubmitReview(){
        clickOnElement(clickOnSubmit);
    }
    public String verifyTheTextThankYouForYourReview(){
        return getTextFromElement(thankYouForReviewText);

    }
}





