package com.taco.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtil {

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitForVisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }



    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);


        List<WebElement> actualOptionsAsWebElement = select.getOptions();


        List<String> actualOptionsAsString = new ArrayList<>();


        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;

    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){

        for (WebElement each : radioButtons ) {
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }

    }
}
