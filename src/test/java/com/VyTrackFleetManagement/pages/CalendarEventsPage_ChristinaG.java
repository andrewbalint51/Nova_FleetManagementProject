package com.VyTrackFleetManagement.pages;

import com.VyTrackFleetManagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage_ChristinaG extends BasePage{

    public CalendarEventsPage_ChristinaG() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatEventCheckBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement dayRepeatInputBox;

    @FindBy(xpath = "(//span[@class='validation-failed'])[2]")
    public WebElement invalidIntErrorMessage;


}
