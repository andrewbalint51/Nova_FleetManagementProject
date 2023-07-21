package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketingPage_ErdenebatU extends BasePage{

    public MarketingPage_ErdenebatU(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Filters']//i")
    public WebElement filterBtn;

    @FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']")
    public WebElement manageFilterBtn;

    @FindBy(xpath = "//input[@title='Name']")
    public WebElement checkName;

    @FindBy(xpath = "//input[@title='Code']")
    public WebElement checkCode;

    @FindBy(xpath = "//input[@title='Start Date']")
    public WebElement checkStartDate;

    @FindBy(xpath = "//input[@title='End Date']")
    public WebElement checkEndDate;

    @FindBy(xpath = "//input[@title='Budget']")
    public WebElement checkBudget;

}
