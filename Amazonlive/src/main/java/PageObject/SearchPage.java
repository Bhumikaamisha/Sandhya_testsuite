package PageObject;

import org.openqa.selenium.By;

public class SearchPage extends Hooks {
    public void enterinsearchbar(String type) {
      driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys(type);

    }

    public void clickonbutton(String clickbutton) {
        driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();

    }
    public void clickonlegolink(String legolink) {
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div[3]/div/a/h2")).click();
    }




    public void clickonaddtobasket(String basketlink) {
        driver.findElement(By.xpath("html/body/div[2]/div[2]/div[6]/div[4]/div[2]/div/div/form/div[1]/div/div[1]/div/div/div[2]/div[3]/span/span/input")).click();
    }


}
