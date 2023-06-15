package com.systemverification.page;

import com.systemverification.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.systemverification.base.BasePage.driver;

public class OpenOptionsPage {

    public OpenOptionsPage(){
    PageFactory.initElements (driver, this);
}

    @FindBy(id = "menu-item-3439")
    public static WebElement careers;

    public static void clickCareers(){
        HelperMethods.click(careers);
    }

    @FindBy (id = "menu-item-3688")
    public static WebElement openOptions;

    public static void clickOpenOptions(){
        HelperMethods.click(openOptions);
    }

    @FindBy (name = "location")
    public static WebElement selectLocation;

    public static void selectMenu(){
        HelperMethods.dropDownMenu(selectLocation);
    }

    public static String verifyUrl(){
        return HelperMethods.currentUrl();
    }
}

