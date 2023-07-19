package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class  MainModulesPage extends BasePage {

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> allTopModules;


    @FindBy(css="#user-menu>a")
    public WebElement userinfo;


    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }



}
