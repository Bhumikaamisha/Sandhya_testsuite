package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil extends Hooks {
    public static boolean isTextPresent(String text) {
        try {
            return driver.findElement(By.tagName("body")).getText().contains(text);
        }
        catch (Exception e)
        {
            return false;
        }
    }




    public static void sleep(int i) {
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void setOurOwnScreenSize(String screenSize) {
        if(screenSize.equals("maximum"))
            driver.manage().window().maximize();
        else if (screenSize.equals("fullscreen"))
            driver.manage().window().fullscreen();
        else if(screenSize.equals("mobile"))
            driver.manage().window().setSize(new Dimension(1024, 768));
    }
}


