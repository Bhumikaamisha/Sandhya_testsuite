package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Hooks {
    @FindBy(tagName = "body")
    private WebElement text;

    @FindBy(xpath = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a[3]")
    private WebElement clicking;



    public void HomePage(){
        PageFactory.initElements(driver,this);
    }
    public boolean IsUserInHomepage() {
        return text.getText().contains("Amazon.co.uk");
    }

    public void clickOnPage(String link) {
        System.out.println("Clicking on the link:" + link);
        clicking.click();

    }

    public void goBack() {
        {
            driver.navigate().back();
        }
    }
}
