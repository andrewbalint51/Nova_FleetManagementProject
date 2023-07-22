package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Accounts_YusufY extends BasePage {
    public Accounts_YusufY() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Filters button
    @FindBy (xpath = "//i[@class=\"fa-filter hide-text\"]")
    public WebElement filterButton;

    @FindBy (xpath = "//span[@class=\"filter-items\"]")
    public List<WebElement> filters;
}
