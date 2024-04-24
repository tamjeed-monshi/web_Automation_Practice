package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWebPage extends BrowserSetup{
    @Test
    public void testPage() throws InterruptedException {
       //create a browser
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        //textbox-by using id
        WebElement autocompleteTextBox= browser.findElement(By.id("autocomplete"));
        autocompleteTextBox.sendKeys("Tamjeed");
        //checkbox-by using name
        WebElement checkbox= browser.findElement(By.name("checkBoxOption1"));
        checkbox.click();
        //rediobtn-by using class name
        WebElement redioBtn= browser.findElement(By.className("radioButton"));
        redioBtn.click();
        //title-bu using tag name
        WebElement title=browser.findElement(By.tagName("h1"));
        System.out.println(title.getText());//for get the title tex
        Thread.sleep(5000);
        //css selector-rediobtn2-
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(5000);
        //xpath-rediobtn-3
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        //green mark text-by using text
        //browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();//linktext -use korle pura text tai dite hobe
        //browser.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
        Thread.sleep(5000);

    }
}
