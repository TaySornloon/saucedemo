package com.hilton.pages;

import com.hilton.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HiltonPage {


    public HiltonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Rooms']")
    public WebElement roomBtn;

    @FindBy(xpath = "//li[@class='text-sm']")
    public List<WebElement> list;

    public List<String> getFacilitiesText() {
        List<String> listOfFacilities = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listOfFacilities.add(list.get(i).getText());
        }
        return listOfFacilities;
    }
}
