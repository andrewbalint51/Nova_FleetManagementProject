package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.LoginPage;
import com.VyTrackFleetManagement.pages.MainModulesPage;
import com.VyTrackFleetManagement.utilities.ConfigurationReader;
import com.VyTrackFleetManagement.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MainModulesStepDef {

    LoginPage login = new LoginPage();
    MainModulesPage mainModulesPage = new MainModulesPage();
    ConfigurationReader configurationReader = new ConfigurationReader();


    @Given("user logged in as {string}")
    public void user_logged_in_as(String userType) {

        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("salesManager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("storeManager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);

    }


    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {
        List<String> actualModules = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        for(WebElement eachModules : mainModulesPage.allTopModules){
            wait.until(ExpectedConditions.visibilityOf(eachModules));
            actualModules.add(eachModules.getText().trim());


        }

       Assert.assertEquals(expectedModules, actualModules);



    }
}





