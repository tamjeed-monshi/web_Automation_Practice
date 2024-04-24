package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleBrowser {
@Test
    public void workWithBrowser() throws InterruptedException {
        WebDriver browser=new ChromeDriver();
//        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
//        Thread.sleep(1000);
//        //window maximizzze
//        browser.manage().window().maximize();
//        Thread.sleep(1000);
//        //window minimize
//        browser.manage().window().minimize();
//        Thread.sleep(1000);
//        //window full screen
//        browser.manage().window().fullscreen();
        Thread.sleep(1000);
        //window maximizzze
        browser.manage().window().maximize();
        Thread.sleep(1000);
        //load a site-
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);
        //load a site another way-
        browser.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
        //window back button
//        browser.navigate().back();
//        Thread.sleep(2000);
//        //window forword button
//        browser.navigate().forward();
//        Thread.sleep(2000);
//        //window refresh button
//        browser.navigate().refresh();
//        Thread.sleep(2000);
            //open new tab
            browser.switchTo().newWindow(WindowType.TAB);
            browser.get("https://rahulshettyacademy.com/AutomationPractice/");
            Thread.sleep(2000);
            //tab close
            //browser.close();
            Thread.sleep(2000);
            //open new window
            browser.switchTo().newWindow(WindowType.WINDOW);//problem
            browser.get("https://rahulshettyacademy.com/AutomationPractice/");
            browser.close();


    }
@Test
    public void test_handle_window() throws InterruptedException {
    WebDriver browser=new ChromeDriver();
    browser.get("https://rahulshettyacademy.com/AutomationPractice/");
    browser.findElement(By.xpath("//button[@id='openwindow']")).click();
    Thread.sleep(5000);
    browser.findElement(By.xpath("//a[@id='opentab']")).click();
    Thread.sleep(5000);
    //tab/window qnique id(present window)
    System.out.println(browser.getWindowHandle());
    //for other window unique id
    List<String> window_handles=new ArrayList<>(browser.getWindowHandles());//problem typecust
    for(String e:window_handles){
        System.out.println(e);
    }
    System.out.println(browser.getTitle());
    System.out.println(browser.getCurrentUrl());
    System.out.println("---------------------------------------");
    browser.switchTo().window(window_handles.get(1));
    System.out.println(browser.getTitle());
    System.out.println(browser.getCurrentUrl());
    //again
    browser.switchTo().window(window_handles.get(0));
    System.out.println(browser.getTitle());
    System.out.println(browser.getCurrentUrl());
    System.out.println("=====================================");
    browser.switchTo().window(window_handles.get(2));
    System.out.println(browser.getTitle());
    System.out.println(browser.getCurrentUrl());
    browser.quit();
    }

}
