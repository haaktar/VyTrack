package com.vytrack.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    public static void wait(int seconds) throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public static void clickWithJs(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click");

    }
}
