package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.List;

public class VehiclePageNC extends BasePage {
    public VehiclePageNC() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    //@FindBy(xpath = "//i[@class='fa-asterisk menu-icon']")
   //@FindBy(xpath = "(//a[@class='unclickable'])[2]")
    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']/a/span[contains(text(),'Fleet')]")
    public WebElement fleetModule;
    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCost;
    //@FindBy(xpath = "(//span[@class='grid-header-cell__label'])[1]")
    @FindBy(xpath = "(//span[.='Type'])[1]")
    public WebElement typeHeader;
    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[2]")
    public WebElement totalPriceHeader;
    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[3]")
    public WebElement dateHeader;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement firstCheckbox;
    @FindBy(xpath = "//input[@data-role='select-row-cell']")
    public List<WebElement> checkboxes;



}
