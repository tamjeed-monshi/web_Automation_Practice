package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class handleAlert extends BrowserSetup{
    @Test
    public void test_Alert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(2000);

        Alert alert=browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);


        System.out.println("---------------------------------");
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(2000);

        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());
        System.out.println("for cancel--------------------");
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(2000);

        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        Thread.sleep(2000);
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());
        System.out.println("========================================");
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(2000);

        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("hellow banguuuuuu");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());

        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);

        alert.accept();
        Thread.sleep(2000);
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());

    }
}
