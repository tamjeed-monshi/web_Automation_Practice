package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {
    public WebDriver browser;
    @BeforeSuite
    public void startBrowser(){
         browser=new ChromeDriver();
    }

    @AfterSuite
    public void quitBrowser(){
        browser.quit();
    }
////importent
    public WebElement browserFindelement(By locate){
        return browser.findElement(locate);
    }
}
