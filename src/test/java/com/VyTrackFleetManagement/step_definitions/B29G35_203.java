package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.VehicleModelsPage_AndrewB;
import com.VyTrackFleetManagement.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class B29G35_203 {

    VehicleModelsPage_AndrewB vehicleModelsPage = new VehicleModelsPage_AndrewB();


    @Given("user clicked on the Vehicle Models page")
    public void user_clicked_on_the_vehicle_models_page() {

        //Wait until the loader screen disappears
        vehicleModelsPage.waitUntilLoaderScreenDisappear();

        //Go through list of options and hover over the Fleet options
        for (WebElement each : vehicleModelsPage.menuOptions) {
            if(each.getText().contains("Fleet")){
                BrowserUtils.hover(each);
                break;
            }
        }

        //Click the Vehicle Models button
        vehicleModelsPage.vehicleModelsButton_AndrewB.click();
    }

    @Then("the user should see “You do not have permission to perform this action.”")
    public void the_user_should_see_you_do_not_have_permission_to_perform_this_action() {

        //Assert that the appropriate error message is displayed
        Assert.assertTrue(vehicleModelsPage.permissionsErrorMessage.isDisplayed());
    }



    @Then("the user should see {int} columns on the Vehicle Models page")
    public void the_user_should_see_columns_on_the_vehicle_models_page(Integer int1) {

        //Wait until the loader screen disappears
        vehicleModelsPage.waitUntilLoaderScreenDisappear();

        //Assert that the table shows the appropriate amount of columns (divide by two,
        //as there are two versions of each column header)
        Assert.assertTrue(vehicleModelsPage.tableColumns.size()/2== int1);
    }



}
