package com.VyTrackFleetManagement.step_definitions;

import com.VyTrackFleetManagement.pages.LoginPage;
import com.VyTrackFleetManagement.pages.MainModulesPage;
import com.VyTrackFleetManagement.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainModulesStepDef {

    LoginPage login = new LoginPage();
    MainModulesPage main = new MainModulesPage();

    @When("user loggs in as a storemanager")
    public void userLoggsInAsAStoremanager() {
    }
    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        login.userName.sendKeys("storemanger51");
        login.password.sendKeys("UserUser123");


    }

    @When("User clicks Login button")
    public void user_clicks_login_button() {
        login.submit.click();

    }

    @Then("Verify the users see module names")
    public void verify_the_users_see_module_names(List<String> listOfModuleNames) {
        //System.out.println("listOfModuleNames: " + listOfModuleNames);
      // String expectedModelNames = "Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System";
       // String actualModuleNames = Driver.getDriver().getTitle();
        List<WebElement> menuList= main.menuOptions;
        System.out.println("listOfModuleNames: " + listOfModuleNames);
       // System.out.println("menuList = " + menuList);
        List<String> actualList = new ArrayList<>();
        for(WebElement each : menuList){
            actualList.add(each.getText()) ;

        }
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(actualList, listOfModuleNames);

    }

    @Then("user should see main module names")
    public void userShouldSeeMainModuleNames() {

    }

    @When("user loggs in as a {string}")
    public void userLoggsInAsA(String storemanager) {
    }


}



