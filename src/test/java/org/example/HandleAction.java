package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class HandleAction extends BrowserSetup{
    private Object keys;

    @Test

    public void handleAction() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions action =new Actions(browser);
        action.scrollToElement(browser.findElement(By.xpath("//button[@id='mousehover']"))).build().perform(); //problem

        action.scrollByAmount(0,350).build().perform();

        action.clickAndHold(browser.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(5000);

        browser.findElement(By.xpath("//a[normalize-space()='Top']")).click();
        Thread.sleep(3000);

        //keybord key

        browser.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(5000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(5000);
        action.sendKeys(Keys.ARROW_UP).build().perform();

        //copy ,paste
        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hello world");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        action.keyDown(Keys.CONTROL);
        action.sendKeys("c");
        action.keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(5000);
        browser.findElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL,"v");
        Thread.sleep(5000);


    }
}
