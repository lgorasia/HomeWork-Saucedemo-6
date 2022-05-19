package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postCodeField;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueField;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButtonField;

    public void clickOnFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void clickOnLastName(String lastName ){
        sendTextToElement(lastNameField,lastName);
    }
    public void clickOnZipcode(String ZipPostalCode){
        sendTextToElement(postCodeField,ZipPostalCode);

    }
    public void clickOnContinue(){
        clickOnElement(continueField);
        log.info("clickOnContinue : " + continueField.toString());
    }
    public void clickOnFinishButton(){
        clickOnElement(finishButtonField);
        log.info("clickOnFinishButton : " + finishButtonField.toString());
    }
}
