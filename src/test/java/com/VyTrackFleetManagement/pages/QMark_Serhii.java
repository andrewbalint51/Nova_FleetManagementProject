package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QMark_Serhii extends BasePage{



    public QMark_Serhii(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(xpath = "//a[@class='help no-hash']")
    public WebElement questionMark;




}
