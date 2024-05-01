package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleSelectTag extends BrowserSetup{
    @Test

    public void  testSelectoption() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        browser.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        Thread.sleep(3000);
        Select selectpart=new Select(browserFindelement(By.xpath("//select[@id='dropdown-class-example']")));
        //text
        selectpart.selectByVisibleText("Option3");
        Thread.sleep(3000);
        //value
        browser.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        Thread.sleep(3000);
        selectpart.selectByValue("option2");
        Thread.sleep(3000);
        //index
        browser.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        Thread.sleep(3000);
        selectpart.selectByIndex(1);
        Thread.sleep(3000);


    }
}
