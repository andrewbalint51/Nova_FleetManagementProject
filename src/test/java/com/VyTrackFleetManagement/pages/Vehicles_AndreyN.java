package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Vehicles_AndreyN extends BasePage {

    public Vehicles_AndreyN() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']/input")
    public WebElement parentCheckBox;

    @FindBy(xpath = "//input[@data-role='select-row-cell']")
    public List<WebElement> listOfCheckBoxes;


}
