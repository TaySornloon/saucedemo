package com.taco.pages;

import com.taco.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TacoPage {

    public TacoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[.='Products']")
    public WebElement productModule;

    @FindBy(xpath = "//a[.='Electronic Controls']" )
    public WebElement electronicControl;

    @FindBy(xpath = "//a[.='Air Fan']" )
    public WebElement airFan;

    @FindBy(xpath = "//h1[.='Hydro Air Fan Control']" )
    public WebElement productTitle;

    @FindBy(xpath = "(//h5[@class='et_pb_toggle_title'])[3]" )
    public WebElement applications;

    @FindBy(xpath = "(//div[@class='et_pb_toggle_content clearfix']//li)[13]" )
    public WebElement applicationsText;

}
