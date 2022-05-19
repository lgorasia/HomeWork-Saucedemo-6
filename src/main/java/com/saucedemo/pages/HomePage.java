package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButtonField;





    public void clickOnUserName(String userName){
        sendTextToElement(usernameField,"standard_user");
        log.info("clickOnUserName : " + usernameField.toString());
    }
    public void clickOnPassword(String password){
        sendTextToElement(passwordField,"secret_sauce");
        log.info("clickOnPassword : " + passwordField.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButtonField);
        log.info("clickOnLoginButton : " + loginButtonField.toString());
    }



}
