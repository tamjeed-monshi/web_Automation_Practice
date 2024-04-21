package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWebPage {
    @Test
    public void testPage() throws InterruptedException {
        WebDriver broeser=new ChromeDriver();
        broeser.get("https://rahulshettyacademy.com/AutomationPractice/");
        //textbox-by using id
        WebElement autocompleteTextBox= broeser.findElement(By.id("autocomplete"));
        autocompleteTextBox.sendKeys("Tamjeed");
        //checkbox-by using name
        WebElement checkbox= broeser.findElement(By.name("checkBoxOption1"));
        checkbox.click();
        //rediobtn-by using class name
        WebElement redioBtn= broeser.findElement(By.className("radioButton"));
        redioBtn.click();
        //title-bu using tag name
        WebElement title=broeser.findElement(By.tagName("h1"));
        System.out.println(title.getText());//for get the title tex
        Thread.sleep(5000);
        //css selector-rediobtn2-
        broeser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(5000);
        //xpath-rediobtn-3
        broeser.findElement(By.xpath("//input[@value='radio3']")).click();
        //green mark text-by using text
        //broeser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();//linktext -use korle pura text tai dite hobe
        //broeser.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
        Thread.sleep(5000);
        broeser.quit();
    }
}
