package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerHomePageAB extends BasePage{

    public ManagerHomePageAB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "/entity/Extend_Entity_VehiclesModel")
    public WebElement vehicleModelsButton;
}
