package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModelsPage_AndrewB extends BasePage{

    public VehicleModelsPage_AndrewB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> tableColumns;
}
