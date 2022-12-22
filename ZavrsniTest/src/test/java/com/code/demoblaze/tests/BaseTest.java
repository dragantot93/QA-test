package com.code.demoblaze.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    public WebDriver driver;

    @BeforeClass(alwaysRun=true)
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gagi\\Desktop\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterClass(alwaysRun=true)
    public void afterClass() {
        driver.quit();
    }






}








