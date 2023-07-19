package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.DriverHomePageAB;
import com.VyTrackFleetManagement.pages.ManagerHomePageAB;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import com.VyTrackFleetManagement.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VehicleModelsStepDefs {

    //DriverHomePageAB driverHomePage = new DriverHomePageAB();
    ManagerHomePageAB managerHomePage = new ManagerHomePageAB();

    @Given("user clicked on the Vehicle Models page")
    public void user_clicked_on_the_vehicle_models_page() {

        for (WebElement each : managerHomePage.menuOptions) {
            if(each.getText().contains("Fleet")){
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
                wait.until(ExpectedConditions.elementToBeClickable(each));
                //Actions actions = new Actions(Driver.getDriver());
           // System.out.println(each.getText());
               // actions.moveToElement(each);
                each.click();
                BrowserUtils.sleep(2);
                managerHomePage.vehicleModelsButton.click();

                BrowserUtils.sleep(2);
                break;
            }
        }

        BrowserUtils.sleep(3);
    }

    @Then("the user should see “You do not have permission to perform this action.”")
    public void the_user_should_see_you_do_not_have_permission_to_perform_this_action() {

    }



    @Then("the user should see {int} columns on the Vehicle Models page")
    public void the_user_should_see_columns_on_the_vehicle_models_page(Integer int1) {

    }



}
