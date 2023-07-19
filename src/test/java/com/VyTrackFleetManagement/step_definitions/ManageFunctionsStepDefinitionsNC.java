package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.LoginPage;
import com.VyTrackFleetManagement.pages.VehiclePageNC;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import com.VyTrackFleetManagement.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ManageFunctionsStepDefinitionsNC {
    VehiclePageNC vehiclePageNC = new VehiclePageNC();
    LoginPage loginPage = new LoginPage();



    @When("User goes to the Vehicle Costs option")
    public void user_goes_to_the_vehicle_costs_option() {
        BrowserUtils.hover(vehiclePageNC.fleetModule);
       Actions action=new Actions(Driver.getDriver());
       action.moveToElement(vehiclePageNC.vehicleCost).click().perform();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
    }

    @Then("User should see three columns on the Vehicle Costs page")
    public void user_should_see_three_columns_on_the_vehicle_costs_page(List<String> columnList) {
        List<WebElement> list=new ArrayList<>();
        list.add(vehiclePageNC.typeHeader);
        list.add(vehiclePageNC.totalPriceHeader);
        list.add(vehiclePageNC.dateHeader);
        for (WebElement each :list) {
            System.out.println(each.getText());
        }
    }

    @When("Checks the first checkbox")
    public void checks_the_first_checkbox() {

    }

    @Then("Users should verify that all the Vehicle costs are checked")
    public void users_should_verify_that_all_the_vehicle_costs_are_checked() {
        System.out.println("hello");
    }

}
