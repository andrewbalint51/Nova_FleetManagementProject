package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.Accounts_YusufY;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class B29G35_241 {

    Accounts_YusufY accounts_yusufY = new Accounts_YusufY();

    @When("user selects the Accounts page under Customers dropdown")
    public void user_selects_the_accounts_page_under_customers_dropdown() {
        //Wait until the loader screen disappears
        accounts_yusufY.waitUntilLoaderScreenDisappear();

        //Go through list of options and hover over the Fleet options
        for (WebElement each : accounts_yusufY.menuOptions) {
            if (each.getText().contains("Customers")) {
                BrowserUtils.hover(each);
                break;
            }
        }

        //Click the Vehicle Models button
        accounts_yusufY.customersButton_YusufY.click();
    }

    @Then("verify that there are {int} filter options")
    public void verify_that_there_are_filter_options(Integer int1) {
        accounts_yusufY.filterButton.click();

        Assert.assertTrue(accounts_yusufY.filters.isEmpty());
    }
}
