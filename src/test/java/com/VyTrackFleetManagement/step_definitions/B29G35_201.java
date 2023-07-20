package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.PinBar_MariaSuzdal;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B29G35_201 {

    PinBar_MariaSuzdal pinBar = new PinBar_MariaSuzdal();

    //1
    @When("Users click the Learn how to use this space message")
    public void users_click_the_learn_how_to_use_this_space_message() {
        BrowserUtils.waitFor(10);
        pinBar.learnHowUseButton.click();
    }

    @Then("Users verify first message on the page")
    public void users_verify_first_message_on_the_page() {

        String expectedResult1 = "How To Use Pinbar";
        String actualResult1 = pinBar.firstText.getText();

        //System.out.println("First text " + actualResult1);

        Assert.assertEquals(actualResult1, expectedResult1);
    }

    @Then("Users verify second message on the page")
    public void users_verify_second_message_on_the_page() {

        String expectedResult2 = "Use the pin icon on the right top corner of the page to create fast access link in the pinbar.";
        String actualResult2 = pinBar.secondText.getText();

        // System.out.println("Second text " + actualResult2);

        Assert.assertEquals(actualResult2, expectedResult2);
    }


    //2
    @Then("Users verify an image")
    public void users_verify_an_image() {

        String expectedResult3 = "https://qa.fleetgru.com/bundles/oronavigation/images/pinbar-location.jpg";
        String actualResult3 = pinBar.imageSource.getAttribute("src");

        //System.out.println("actualResult3 = " + actualResult3);

        Assert.assertEquals(actualResult3, expectedResult3);


    }

}
