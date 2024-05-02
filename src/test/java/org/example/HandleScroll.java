package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleScroll extends BrowserSetup{
    @Test
    public void testScroll() throws InterruptedException {
         browser.get("https://rahulshettyacademy.com/AutomationPractice/");

         JavascriptExecutor js=(JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
         js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        Thread.sleep(3000);

        //js executor view port
        WebElement hoverelement=browser.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();",hoverelement);
        Thread.sleep(5000);
    }
}
