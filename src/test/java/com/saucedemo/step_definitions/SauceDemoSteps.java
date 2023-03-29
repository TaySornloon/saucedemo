package com.saucedemo.step_definitions;


import com.saucedemo.pages.SauceDemoPage;
import com.saucedemo.utilities.ConfigReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SauceDemoSteps {
    SauceDemoPage sauceDemo = new SauceDemoPage();
    @Given("I am on the Sauce Demo homepage")
    public void i_am_on_the_sauce_demo_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));
    }
    @When("I enter valid login credentials")
    public void i_enter_valid_login_credentials() {
        sauceDemo.inputUsername.sendKeys("standard_user");
        sauceDemo.inputPassword.sendKeys("secret_sauce");

    }
    @When("click on the login button")
    public void click_on_the_login_button() {
        sauceDemo.loginBtn.click();

    }
    @Then("I should see {string} at the homepage after login")
    public void i_should_see_at_the_homepage(String expectedText) {
        Assert.assertEquals(expectedText,sauceDemo.textProduct.getText());
    }

}
