package com.example.PageObjects;

import com.example.Base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class B_PersonsPage extends BaseClass{
    public static WebDriver weBdriver;

    public B_PersonsPage(WebDriver ldriver){
        this.weBdriver=ldriver;
        PageFactory.initElements(ldriver,this);
    }

    public void clickPersonsMenu() throws Throwable{
        WebElement element=weBdriver.findElement(By.id("personSearchMenuOption"));
        element.click();
    }

    public void selectActiveFromStatus() throws Throwable{
        WebElement element=weBdriver.findElement(By.id("status"));
        element.click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("status"));
            dropdown.findElement(By.xpath("//option[. = 'ACTIVE']")).click();
        }
    }

    public void clickSearch() throws Throwable{
        WebElement element=weBdriver.findElement(By.cssSelector(".search"));
        element.click();
    }

    public void assertStep() throws Throwable{
        String assertText="Person(s):";
        System.out.println(weBdriver.findElement(By.cssSelector("h2")).getText());
        Assert.assertTrue(assertText.equals(weBdriver.findElement(By.cssSelector("h2")).getText()));
    }

    public void clickLogout() throws Throwable{
        WebElement element=weBdriver.findElement(By.linkText("Logout"));
        element.click();
    }
}
