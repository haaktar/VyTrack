package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public abstract class BasePage {

    @FindBy(className = "oro-subtitle")
    protected WebElement pageSubtitle;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getPageSubtitleText() {
        return pageSubtitle.getText();
    }

    public void navigateTo(String tab, String module) {

        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 30);
        String tabXpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span";
        String moduleXpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span";


        //WebElement tabElement = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(tabXpath)));

        WebElement tabElement = (WebElement) webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(tabXpath)));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(tabElement)).click();
    }

}
