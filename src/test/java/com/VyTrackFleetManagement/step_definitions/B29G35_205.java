package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.Vehicles_AndreyN;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class B29G35_205 {

    Vehicles_AndreyN vehicles = new Vehicles_AndreyN();

    @When("user go to vehicles")
    public void user_go_to_vehicles() {
        BrowserUtils.waitFor(3);

        BrowserUtils.hover(vehicles.menuOptionsFleet_AndreyN);

        vehicles.vehiclesOption_AndreyN.click();
    }

    @Then("All checkboxes is visible enabled and unchecked")
    public void allCheckboxesUnchecked() {

        List<WebElement> list = vehicles.listOfCheckBoxes;

        if (list.size() < 1) {
            Assert.fail("There is no checkBoxes");
        }

        boolean allElementsUnselected = true;

        for (WebElement element : list) {
            if (element.isSelected()) {
                allElementsUnselected = false;
            }

        }
        Assert.assertTrue("some check boxes are selected", allElementsUnselected);

    }

    @And("User check the parent checkbox")
    public void userCheckTheParentCheckbox() {
        vehicles.parentCheckBox.click();

    }

    @Then("All visible checkboxes is checked")
    public void allVisibleCheckboxesIsChecked() {

        List<WebElement> list = vehicles.listOfCheckBoxes;
        if (list.size() < 1) {
            Assert.fail("There is no checkBoxes");
        }

        boolean allElementsSelected = true;
        for (WebElement element : list) {
            if (!element.isSelected()) {
                allElementsSelected = false;
            }
        }
        Assert.assertTrue("some check boxes are UNselected", allElementsSelected);


    }

    @Then("User check and verify all checkbox")
    public void userCheckAndVerifyAllCheckbox() {
        List<WebElement> list = vehicles.listOfCheckBoxes;
        if (list.size() < 1) {
            Assert.fail("There is no checkBoxes");
        }


        for (WebElement element : list) {
            element.click();
            if (element.isSelected()) {
                element.click();
                continue;
            }
            Assert.fail();
        }
        Assert.assertTrue(true);

    }
}
