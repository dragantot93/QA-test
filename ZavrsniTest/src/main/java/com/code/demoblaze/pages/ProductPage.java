package com.code.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    public WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnAddToCart() {
        return driver.findElement(By.cssSelector("a[class*='btn']"));
    }

    public WebElement cartPageBtn() {

        return driver.findElement(By.cssSelector("#cartur"));
    }

    public By loginBtnBlock() {

        return By.cssSelector("a[style='display: block;'][id='nameofuser']");
    }

    public void clickBtnAddToCart() throws InterruptedException {


        Thread.sleep(2000);
        getBtnAddToCart().click();
    }

    public void acceptAlertAfterAddingItem() {


        w.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void openCartPage() throws InterruptedException {

        cartPageBtn().click();
        Thread.sleep(3000);
    }

    public void openHomePage() {

        driver.findElement(By.cssSelector("a[href='index.html']")).click();
        w.until(ExpectedConditions.presenceOfElementLocated(loginBtnBlock()));
    }

}
