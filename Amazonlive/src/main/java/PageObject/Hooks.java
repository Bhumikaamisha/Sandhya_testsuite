package PageObject;

import PageObject.AutomationConstants;
import PageObject.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import  org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Hooks  {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }


    @BeforeClass
    public static void openBrowser() {
        System.out.println("starting the browser");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(AutomationConstants.URL);//open
        driver.manage().timeouts().implicitlyWait(AutomationConstants.MAX_TIMEOUTS, TimeUnit.SECONDS);
       //WebDriverUtil.setOurOwnScreenSize(AutomationConstants.SCREENSIZE);

    }

    @AfterClass
    public static void closeBrowser() {
        System.out.println("I am in closing");
        driver.quit();
    }
}

