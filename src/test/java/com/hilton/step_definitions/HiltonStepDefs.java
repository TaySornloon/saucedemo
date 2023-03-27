package com.hilton.step_definitions;


import com.hilton.pages.HiltonPage;
import com.hilton.utilities.ConfigReader;
import com.hilton.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class HiltonStepDefs {
    HiltonPage hiltonPage = new HiltonPage();
    @Given("User locate to the Hilton Memphis homepage")
    public void user_locate_to_the_hilton_memphis_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("HiltonURL"));
    }
    @When("User click on rooms module")
    public void user_click_on_rooms_module() {
        hiltonPage.roomBtn.click();
    }
    @Then("Verify hotel facilities listed below")
    public void verify_hotel_listed_below( List<String> expectedListOfFacilities) {
        Assert.assertEquals(expectedListOfFacilities,hiltonPage.getFacilitiesText());
    }
}
