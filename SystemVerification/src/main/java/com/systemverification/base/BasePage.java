package com.systemverification.base;


import org.openqa.selenium.chrome.ChromeDriver;
import com.systemverification.utils.Constans;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;




public class BasePage {

    public static WebDriver driver;

    public static WebDriver initializeDriver() {
        Confireader.readProperties(Constans.CONFIGURATION_FILE);
        String browser = Confireader.getProperty("browser");
        String baseUrl = Confireader.getProperty("url");
        switch (browser){

            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid Browser");
                throw new RuntimeException("Invalid Browser Name");

        }

        PageManager.initialize();
        driver.manage().timeouts().implicitlyWait(Constans.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.get(baseUrl);
        return driver;
    }

    public static void tearDown(){
        if (driver != null) driver.quit();
    }


}
