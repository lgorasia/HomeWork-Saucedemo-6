package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement filterfield;

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> products;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement clickOnCartField;

    public void selectFilter() {
        selectByIndexFromDropDown(filterfield, 3);
    }

    public void selectCostliestProductAndAddToTheBasket() {

        for (int i = 0; i < products.size(); i++) {
            if (i == 0 || i == products.size() - 1) {
                log.info("Adding product to the cart: " + products.get(i).toString());
                //  Thread.sleep(1000);
                clickOnElement(products.get(i));
            }
        }

    }
    public void clickOnShoppingCart(){
        clickOnElement(clickOnCartField);
        log.info("clickOnShoppingCart : " + clickOnCartField.toString());
    }
}
