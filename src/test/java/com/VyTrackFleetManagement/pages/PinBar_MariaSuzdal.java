package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinBar_MariaSuzdal extends BasePage{

    public PinBar_MariaSuzdal(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Learn how to use this space")
    public WebElement learnHowUseButton;

    @FindBy(xpath = "//div[@ class = 'clearfix']//h3")
    public WebElement firstText;

    @FindBy(xpath = "//div[@ class = 'clearfix']//p[1]")
    public WebElement secondText;

    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement imageSource;
}
