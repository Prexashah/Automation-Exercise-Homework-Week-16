package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class Test14_PlaceOrderAndRegisterWhileCheckoutSteps {
    @Then("User should verify that {string} is displayed")
    public void userShouldVerifyThatIsDisplayed(String shoppingCart) {
        Assert.assertEquals(new ShoppingCartPage().verifyShoppingCartMessage(), shoppingCart, "user is on shopping cart page");
    }

    @And("User click on proceed to checkout button")
    public void userClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckOutButton();

    }

    @And("Use clicks on register,login button")
    public void useClicksOnRegisterLoginButton() {
        new ShoppingCartPage().clickOnRegisterLoginButtonFromPopup();
    }

    @And("User enter name {string} for newSignup")
    public void userEnterNameForNewSignup(String text) {
        new NewUserSignUpPAge().enterName(text);
    }

    @And("user enter email address {string} for newSignup")
    public void userEnterEmailAddressForNewSignup(String email) {
        new NewUserSignUpPAge().enterEmailAddress(email);
    }

    @And("clicks on Signup button.")
    public void clicksOnSignupButton() {
        new NewUserSignUpPAge().clickOnSignupButton();
    }

    @And("click on Cart button")
    public void clickOnCartButton() {
        new HomePage().clickOnCartButton();
    }

    @And("Click on Proceed to chekout")
    public void clickOnProceedToChekout() {
        new ShoppingCartPage().clickOnProceedToCheckOutButton();
    }

    @And("verify {string}")
    public void verify(String title) {
        Assert.assertEquals(new CheckoutPage().verifyTitleAddressDetails(), title, "you are not on checkout page");

    }

    @And("verify text {string}")
    public void verifyText(String order) {
        Assert.assertEquals(new CheckoutPage().verifyTextReviewOrder(), order, "you are not on checkout page");

    }

    @And("Enter description{string}")
    public void enterDescription(String comment) {
        new CheckoutPage().enterCommentInTheBox(comment);

    }


    @And("Click on placeOrder")
    public void clickOnPlaceOrder() {
        new CheckoutPage().clickOnPlaceOrderButton();
    }

    @When("User fill below detail")
    public void userFillBelowDetail(DataTable dataTable) {
        List<String> creditCardInfo = dataTable.asList(String.class);
        new PaymentPage().enterNameOnTheCard(creditCardInfo.get(0));
        new PaymentPage().enterCardNumber(creditCardInfo.get(1));
        new PaymentPage().enterCardCVV(creditCardInfo.get(2));
        new PaymentPage().enterExpiryMonth(creditCardInfo.get(3));
        new PaymentPage().enterExpiryYear( creditCardInfo.get(4));

    }

    @And("User clicks on pay and confirm order")
    public void userClicksOnPayAndConfirmOrder() {
        new PaymentPage().userClickOnPlaceOrder();
    }
}
