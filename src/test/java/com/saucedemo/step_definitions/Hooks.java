package com.saucedemo.step_definitions;


import com.saucedemo.utilities.ConfigReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));
    }


    @After
    public void teardownScenario(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }




        Driver.closeDriver();
    }











}
