package com.taco.step_definitions;


import com.taco.pages.TacoPage;
import com.taco.utilities.ConfigReader;
import com.taco.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;



public class Taco_step_defs {
    TacoPage tacoPage = new TacoPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("user go to the Taco homepage")
    public void user_go_to_the_taco_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("tacoUrl"));

    }
    @When("user use a mouse to hover over on product module")
    public void user_use_a_mouse_to_hangover_on_product_module() {
        actions.moveToElement(tacoPage.productModule).perform();
    }
    @When("user click on electronic control at drop down")
    public void user_click_on_electronic_control_at_drop_down() {
        actions.moveToElement(tacoPage.electronicControl).click().perform();
    }
    @When("user click on Air fan option")
    public void user_click_on_air_fan_option() {
            tacoPage.airFan.click();
    }
    @Then("verify if the name is {string}")
    public void verify_if_the_name_is(String string) {

        Assert.assertEquals(string,tacoPage.productTitle.getText());
    }
    @Then("user click on the applications module")
    public void user_click_on_the_applications_module() {
            tacoPage.applications.click();
    }
    @Then("verify message {string} under applications")
    public void verify_message_under_applications(String string) {
        Assert.assertEquals(string,tacoPage.applicationsText.getText());
    }

	
}
