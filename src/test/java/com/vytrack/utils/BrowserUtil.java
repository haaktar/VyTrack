package com.vytrack.utils;

import org.checkerframework.checker.index.qual.PolyUpperBound;
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


    public static void enterText(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(element, "value", text));
        System.out.println("Entering Text: " + text);
    }
}
