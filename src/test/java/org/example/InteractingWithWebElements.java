package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends BrowserSetup{
    @Test
    public void testElements() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
//        browser.findElement(By.xpath("//input[@value='radio1']")).click();
//        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hello world");
//
//        Thread.sleep(2000);
//        browser.findElement(By.xpath("//input[@id='autocomplete']")).clear();
//        Thread.sleep(2000);
//        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bangladesh ");
//        Thread.sleep(2000);
//
//        WebElement text=browser.findElement(By.xpath("//label[normalize-space()='Option1']"));
//        System.out.println(text.getText());
//
//
//       String text_1= browser.findElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
//        System.out.println(text_1);
//
//        String font=browser.findElement(By.xpath("//button[@id='openwindow']")).getCssValue("font-size");
//        System.out.println(font);
//        String color=browser.findElement(By.xpath("//button[@id='openwindow']")).getCssValue("background-color");
//        System.out.println(color);


        //display or not/check or not/ select or not
        Boolean yesNo=browserFindelement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println(yesNo);
        browserFindelement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Boolean yesNoagain=browserFindelement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println(yesNoagain);
        System.out.println("-----------------------------");
        Boolean display=browserFindelement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println(display);
        browserFindelement(By.xpath("//input[@id='hide-textbox']")).click();
        display = browserFindelement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println(display);
        System.out.println("------------==================--------------");
        browser.get("https://www.google.com/");
       Boolean enableDisable1= browserFindelement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        System.out.println(enableDisable1);

    }
}
