package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleDemoPageObject {
    public ScheduleDemoPageObject() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement LastName;

    @FindBy(xpath = "(//input[@id='Email'])[1]")
    public WebElement BusinessEmail;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//input[@id='Company']")
    public WebElement CompanyName;

    @FindBy(xpath = "//input[@id='Units_Opportunity__c']")
    public WebElement NumberOfUniteYouManage;

    @FindBy(xpath = "//label[@id='LblmktoCheckbox_9901_0']")
    public WebElement ZegoPay;

    @FindBy(xpath = "//label[@id='LblmktoCheckbox_9901_1']")
    public WebElement ZegoUtility;

    @FindBy(xpath = "//label[@id='LblmktoCheckbox_9901_2']")
    public WebElement ZegoMobileDoorman;

    @FindBy(xpath = "(//button[@class='mktoButton'])[1]")
    public WebElement SubmitAndPickUpTime;

    @FindBy(xpath = "//h1[@class='page-header__heading']")
    public WebElement ThankYouMessage;

    @FindBy(xpath = "//div[@id='ValidMsgFirstName']")
    public WebElement ErrorMessage;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement SubscribeEmail;

    @FindBy(xpath = "//button[@class='subscribe-form__submit button']")
    public WebElement SubscribButton;

    @FindBy(xpath = "//h1[@class='page-header__heading']")
    public WebElement SubscribeMessage;





}
