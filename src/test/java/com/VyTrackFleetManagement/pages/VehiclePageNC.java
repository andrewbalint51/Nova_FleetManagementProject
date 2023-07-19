package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.crypto.dom.DOMCryptoContext;

public class VehiclePageNC extends BasePage {
    public VehiclePageNC() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    //@FindBy(xpath = "//i[@class='fa-asterisk menu-icon']")
   // @FindBy(xpath = "(//a[@class='unclickable'])[2]")
    public WebElement fleetModule;
    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCost;
    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[1]")
    public WebElement typeHeader;
    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[2]")
    public WebElement totalPriceHeader;
    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[3]")
    public WebElement dateHeader;


}
