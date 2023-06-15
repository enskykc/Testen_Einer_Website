package com.systemverification.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.systemverification.base.BasePage.driver;


public class HelperMethods {

    public static void click(WebElement element){

        try {
            waitForClickAbility(element);
            element.click();
        }
        catch (Exception e) {
            System.out.println("Some exception occurred while clicking at " + element);
        }

    }

    private static void waitForClickAbility(WebElement element) {
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    private static WebDriverWait getWaitObject() {

        return new WebDriverWait(driver, Constans.EXPLICIT_WAIT_TIME);
    }

    public static String currentUrl(){

        try {
            return driver.getCurrentUrl();
        }
        catch (Exception e) {
            System.out.println("Some exception occurred while getting the URL");
            return null;
    }

}
    public static String GetPageTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            System.out.println("Some exception occurred while getting the title");
            return null;
        }
    }
    public static void dropDownMenu(WebElement element){
        Select select = new Select(element);
        select.selectByIndex(5);
    }
}

