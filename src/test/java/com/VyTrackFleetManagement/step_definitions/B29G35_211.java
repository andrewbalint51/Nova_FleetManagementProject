package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.LoginPage;
import com.VyTrackFleetManagement.pages.VehiclePageNC;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import com.VyTrackFleetManagement.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class B29G35_211 {
    VehiclePageNC vehiclePageNC = new VehiclePageNC();



    @When("User goes to the Vehicle Costs option")
    public void user_goes_to_the_vehicle_costs_option() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(vehiclePageNC.fleetModule));
        BrowserUtils.hover(vehiclePageNC.fleetModule);

        vehiclePageNC.vehicleCost.click();

    }

    @Then("User should see three columns on the Vehicle Costs page")
    public void user_should_see_three_columns_on_the_vehicle_costs_page(List<String> columnList) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(vehiclePageNC.typeHeader));

        List<WebElement> list = new ArrayList<>();
        List<String> actualList = new ArrayList<>();
        list.add(vehiclePageNC.typeHeader);
        list.add(vehiclePageNC.totalPriceHeader);
        list.add(vehiclePageNC.dateHeader);
        for (WebElement each : list) {
            actualList.add(each.getText());
        }
        Assert.assertEquals(columnList, actualList);
    }

    @When("Checks the first checkbox")
    public void checks_the_first_checkbox() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(vehiclePageNC.firstCheckbox));
        vehiclePageNC.firstCheckbox.click();
    }

    @Then("Users should verify that all the Vehicle costs are checked")
    public void users_should_verify_that_all_the_vehicle_costs_are_checked() {

        BrowserUtils.sleep(5);
        List<WebElement> types = vehiclePageNC.checkboxes;


        if (types.isEmpty()) {
            Assert.assertTrue("We can't locate the element", false);
        }

        for (WebElement each : types) {

            if (!each.isSelected()) {
                System.out.println(each);
                Assert.assertTrue("It's not selected", false);
            }
        }
        Assert.assertTrue(true);
    }


}
