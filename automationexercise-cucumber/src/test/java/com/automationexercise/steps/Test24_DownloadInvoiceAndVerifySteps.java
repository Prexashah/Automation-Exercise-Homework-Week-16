package com.automationexercise.steps;

import com.automationexercise.pages.OrderPlacedPage;
import io.cucumber.java.en.And;

public class Test24_DownloadInvoiceAndVerifySteps {
    @And("click on Download invoce button")
    public void clickOnDownloadInvoceButton() {
        new OrderPlacedPage().downloadInvoice();
        //above logic is in correct as I cannot verify the download. I will explore the logic and submit it again.

    }
}
