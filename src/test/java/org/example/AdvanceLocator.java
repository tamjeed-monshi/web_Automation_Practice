package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AdvanceLocator extends BrowserSetup{
    @Test
    public void testpageLocator() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        //css selector-rediobtn2-
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(3000);
        //xpath-rediobtn-3
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(3000);
        //using id
        browser.findElement(By.cssSelector("#checkBoxOption1")).click();
        Thread.sleep(2000);
        //using class name
        browser.findElement(By.cssSelector(".radioButton")).click();
        Thread.sleep(3000);
        //using tag name-css selector
        WebElement h1_css=browser.findElement(By.cssSelector("h1"));//we can use string in webelement part
        System.out.println("css selector"+h1_css.getText());
        Thread.sleep(2000);
        //using tag name-xpath
        WebElement h1_xpath=browser.findElement(By.xpath("//h1"));//we can use string in webelement part
        System.out.println("x-path"+h1_xpath.getText());
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@value='radio3']")).click();
        Thread.sleep(2000);
        //using parent child-css selector
        WebElement text=browser.findElement(By.cssSelector("div[id='checkbox-example']>fieldset>legend"));//string dile vul dekhaitese
        System.out.println(text.getText());
        Thread.sleep(2000);
       WebElement text2=browser.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/legend"));// text2 dileo vul ashtese
        System.out.println(text2.getText());
       Thread.sleep(2000);
       //using multiple element
        WebElement btn1=browser.findElement(By.xpath("//input[@name='radioButton' and @value='radio1']"));
        btn1.click();
        Thread.sleep(2000);
        WebElement btn3=browser.findElement(By.cssSelector("input[name='radioButton'][value='radio3']"));
        btn3.click();
        Thread.sleep(2000);
        //dynamic-using subString
        browser.findElement(By.cssSelector("input[placeholder^=\"Enter Your\"]")).sendKeys("hello css selector");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[starts-with(@placeholder,\"Enter Your\")]")).sendKeys("hello x-path");
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("input[placeholder*=\" Your\"]")).sendKeys("hello css selector");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[contains(@placeholder,\"Your\")]")).sendKeys("hello x-path");
        Thread.sleep(2000);
       WebElement table_text = browser.findElement(By.xpath("//table[@name=\"courses\"]//tr/th[1]"));
        System.out.println(table_text.getText());
        Thread.sleep(2000);
        WebElement table_text_last= browser.findElement(By.xpath("//table[@name=\"courses\"]//tr/th[last()]"));
        System.out.println(table_text_last.getText());
        Thread.sleep(2000);
        WebElement table_text_second= browser.findElement(By.cssSelector("table[name=\"courses\"]>tbody>tr>th:nth-child(2)"));
        System.out.println(table_text_second.getText());
        Thread.sleep(2000);
        //sibling
        String text_sibling = browser.findElement(By.xpath("//th[contains(text(),'Instruc')]/following-sibling::th[1]")).getText();
        System.out.println("sibling :"+text_sibling);
        Thread.sleep(2000);
        //multiple data return-using find elements
        List<WebElement> table_alldata=browser.findElements(By.xpath("//table[@name='courses']//td"));
        System.out.println(table_alldata.size());
        for(WebElement p:table_alldata){
            System.out.println(p.getText());
        }
    }
}
