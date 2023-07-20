package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.BasePage;
import com.VyTrackFleetManagement.pages.CalendarEventsPage_ChristinaG;
import com.VyTrackFleetManagement.pages.LoginPage;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class B29G35_207 {

    LoginPage loginPage = new LoginPage();
    CalendarEventsPage_ChristinaG calendarEventsPage = new CalendarEventsPage_ChristinaG();



    @Given("User is logged in using {string} and a {string}")
    public void user_is_logged_in_using_and_a(String string, String string2) {
        loginPage.login(string, string2);
    }
    @When("User navigates to {string} and clicks {string}")
    public void user_navigates_to_and_clicks(String string, String string2) {
        BrowserUtils.waitForVisibility(calendarEventsPage.menuOptionActivities_ChristinaG, 10);
        calendarEventsPage.navigateToModule(string, string2);
    }
    @When("Clicks the \"Create Calendar Event\" button")
    public void clicks_the_button() {
        BrowserUtils.waitForVisibility(calendarEventsPage.createCalendarEventButton, 10);
        calendarEventsPage.createCalendarEventButton.click();
    }
    @When("Checks the \"Repeat\" checkbox")
    public void checks_the_checkbox() {
        BrowserUtils.waitForVisibility(calendarEventsPage.repeatEventCheckBox, 10);
        calendarEventsPage.repeatEventCheckBox.click();
    }
    @When("User enters {string}")
    public void user_enters(String string) {
        BrowserUtils.waitForVisibility(calendarEventsPage.dayRepeatInputBox, 10);
        calendarEventsPage.dayRepeatInputBox.sendKeys(Keys.BACK_SPACE);
        calendarEventsPage.dayRepeatInputBox.sendKeys(string + Keys.ENTER);
    }
    @Then("{string} is displayed")
    public void is_displayed(String string) {
        BrowserUtils.waitForVisibility(calendarEventsPage.invalidIntErrorMessage, 10);
        Assert.assertEquals(string, calendarEventsPage.invalidIntErrorMessage.getText());
    }

}
