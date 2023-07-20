package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.LoginPage;
import com.VyTrackFleetManagement.pages.QMark_Serhii;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import com.VyTrackFleetManagement.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.Set;

public class B29G35_200_SKuzmUS_StepDefs {

    QMark_Serhii qMarkSerhii = new QMark_Serhii();

    @When("users clicks on question icon")
    public void users_clicks_on_question_icon() {

        BrowserUtils.waitFor(2);

        qMarkSerhii.questionMark.click();




        String oronicTab = "https://doc.oroinc.com/";
        Set<String> windows = Driver.getDriver().getWindowHandles();//put all the handles to the Set
        // compare the current window handle
        //with each handle in the Set

        for (String handle : windows) {
            Driver.getDriver().switchTo().window(handle);
            String currentURL = Driver.getDriver().getCurrentUrl();

            if (currentURL.equals(oronicTab)) {
                break;
            }

        }


    }

    @Then("they access the Oronic Documentation page")
    public void they_access_the_oronic_documentation_page() {



        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "https://doc.oroinc.com/";

        Assert.assertEquals(actual, expected);


    }


}
