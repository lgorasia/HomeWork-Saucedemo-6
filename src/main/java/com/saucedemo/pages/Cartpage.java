package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public Cartpage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//button[@id='checkout']")
    WebElement checkOutField;

    public void clickOnCheckOut(){
        clickOnElement(checkOutField);
        log.info("Clicking on checkOut : " + checkOutField.toString());
    }
}

