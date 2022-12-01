package com.test.step_definition;

import com.test.pages.ScheduleDemoPageObject;
import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ScheduleDemoStepDef {
    ScheduleDemoPageObject scheduleDemoPageObject = new ScheduleDemoPageObject();

    @Given("user is in the schedule a demo page")
    public void user_is_in_the_schedule_a_demo_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
    }

    @When("user enter all the required fields")
    public void user_enter_all_the_required_fields() {
        scheduleDemoPageObject.FirstName.sendKeys("Ryan");
        scheduleDemoPageObject.LastName.sendKeys("La Bossiere");
        scheduleDemoPageObject.BusinessEmail.sendKeys("rlabossiere@gozego.com");
        scheduleDemoPageObject.PhoneNumber.sendKeys("610-737-0815");
        scheduleDemoPageObject.CompanyName.sendKeys("Global Payments");
        scheduleDemoPageObject.NumberOfUniteYouManage.sendKeys("4");
        scheduleDemoPageObject.ZegoPay.click();
        scheduleDemoPageObject.ZegoUtility.click();
        scheduleDemoPageObject.ZegoMobileDoorman.click();

    }

    @When("user click on submit and pick up time")
    public void user_click_on_submit_and_pick_up_time() {
        scheduleDemoPageObject.SubmitAndPickUpTime.click();

    }

    @Then("user should see {string}")
    public void user_should_see(String Message) {
        Assert.assertEquals(Message, scheduleDemoPageObject.ThankYouMessage.getText());

    }

    @When("user leave all the fields empty")
    public void user_leave_all_the_fields_empty() {
        scheduleDemoPageObject.FirstName.clear();
        scheduleDemoPageObject.LastName.clear();
        scheduleDemoPageObject.BusinessEmail.clear();
        scheduleDemoPageObject.PhoneNumber.clear();
        scheduleDemoPageObject.CompanyName.clear();
        scheduleDemoPageObject.NumberOfUniteYouManage.clear();


    }

    @Then("user should see {string} error")
    public void user_should_see_error(String error) {
        Assert.assertEquals(error, scheduleDemoPageObject.ErrorMessage.getText());

    }
    @When("user enter the email")
    public void user_enter_the_email() {
        scheduleDemoPageObject.SubscribeEmail.sendKeys("rlabossiere@gozego.com");

    }
    @When("user click on subscribe button")
    public void user_click_on_subscribe_button() {
        scheduleDemoPageObject.SubscribButton.click();

    }
    @Then("user should see {string} success")
    public void user_should_see_success(String SubscribeMessage) {
        Assert.assertEquals(SubscribeMessage, scheduleDemoPageObject.SubscribeMessage.getText());

    }


}
