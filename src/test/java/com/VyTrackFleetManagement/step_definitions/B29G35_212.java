package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.MarketingPage_ErdenebatU;
import com.VyTrackFleetManagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class B29G35_212 {

    MarketingPage_ErdenebatU marketingPage = new MarketingPage_ErdenebatU();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Given("Users are on the homepage")
    public void users_are_on_the_homepage() {
        Assert.assertEquals(marketingPage.getPageSubTitle(), "Dashboard");

    }
    @When("User click the Campaigns under the Marketing")
    public void user_click_the_campaigns_under_the_marketing() {
        marketingPage.navigateToModule("Marketing", "Campaigns");
        marketingPage.waitUntilLoaderScreenDisappear();

    }

    @When("User click the filters button")
    public void userClickTheFiltersButton() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(marketingPage.filterBtn));
        marketingPage.filterBtn.click();
    }
    @When("User click the Manage filters button")
    public void user_click_the_manage_filters_button() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(marketingPage.manageFilterBtn));
        marketingPage.manageFilterBtn.click();
    }


    @Then("User verify five options are checked by default")
    public void userVerifyFiveOptionsAreCheckedByDefault() {
        Assert.assertTrue(marketingPage.checkName.isSelected());
        Assert.assertTrue(marketingPage.checkCode.isSelected());
        Assert.assertTrue(marketingPage.checkStartDate.isSelected());
        Assert.assertTrue(marketingPage.checkEndDate.isSelected());
        Assert.assertTrue(marketingPage.checkBudget.isSelected());

    }





    @When("User uncheck one or more filter options")
    public void user_uncheck_one_or_more_filter_options() {
        marketingPage.checkName.click();
        marketingPage.checkEndDate.click();

    }
    @Then("User verify one or more options are unchecked")
    public void user_verify_one_or_more_options_are_unchecked() {
        Assert.assertFalse(marketingPage.checkName.isSelected());
        Assert.assertFalse(marketingPage.checkEndDate.isSelected());

    }







}
