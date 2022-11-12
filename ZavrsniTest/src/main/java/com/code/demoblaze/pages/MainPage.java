package com.code.demoblaze.pages;

import com.code.demoblaze.models.Product;
import com.code.demoblaze.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage extends BasePage {

    public WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

    public MainPage(WebDriver driver) {
        super(driver);


    }

    public void openPage() {
        this.driver.get("https://www.demoblaze.com/");
        this.driver.manage().window().maximize();
    }

    public WebElement logInOpener() {
        return driver.findElement(By.cssSelector("a[id='login2']"));
    }

    public WebElement getInpUserName() {
        return driver.findElement(By.cssSelector("#loginusername"));
    }

    public WebElement getInpPassword() {
        return driver.findElement(By.cssSelector("#loginpassword"));
    }

    public WebElement getBtnLogin() {
        return driver.findElement(By.cssSelector("button[onclick='logIn()']"));
    }

    public WebElement getWelcomeTestBtn() {
        return driver.findElement(By.cssSelector("a[id='nameofuser']"));
    }

    public WebElement cartPageBtn() {

        return driver.findElement(By.cssSelector("#cartur"));
    }

    public void acceptAlert() {

        driver.switchTo().alert().accept();
    }

    public void clickOnLogInOpener() {

        logInOpener().click();
        w.until(ExpectedConditions.visibilityOf(getInpUserName()));
    }

    public void login(String userName, String password) throws InterruptedException {

        getInpUserName().sendKeys(userName);
        getInpPassword().sendKeys(password);
        getBtnLogin().click();
        Thread.sleep(3000);
    }

    public void login(User user) throws InterruptedException {

        getInpUserName().sendKeys(user.getUserName());
        getInpPassword().sendKeys(user.getPassword());
        getBtnLogin().click();

        Thread.sleep(3000);
    }

    public void openCartPage() throws InterruptedException {

        cartPageBtn().click();
        Thread.sleep(2000);

    }

    public void addItemToCartByName(String name) throws InterruptedException {

        List<WebElement> webElementList = this.getProducts();
        for (int i = 0; i < webElementList.size(); i++) {

            WebElement webElementItemName = webElementList.get(i).findElement(By.cssSelector("a[class='hrefch']"));
            String itemName = webElementItemName.getText();

            if (itemName.equals(name)) {
                WebElement btnAddToCart = getProducts().get(i).findElement(By.cssSelector("a[class='hrefch']"));
                btnAddToCart.click();
                break;
            }
        }

        if (driver.getCurrentUrl().equals("https://www.demoblaze.com/")) {

            driver.findElement(By.cssSelector("button[id='next2']")).click();
            Thread.sleep(4000);
            List<WebElement> webElementList2 = this.getProducts();

            for (int i = 0; i < webElementList2.size(); i++) {

                WebElement webElementItemName = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                String itemName = webElementItemName.getText();

                if (itemName.equals(name)) {
                    WebElement btnAddToCart = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                    btnAddToCart.click();
                    break;
                }
            }
        }

        if (driver.getCurrentUrl().equals("https://www.demoblaze.com/index.html")) {
            driver.findElement(By.cssSelector("button[id='next2']")).click();
            Thread.sleep(4000);
            List<WebElement> webElementList2 = this.getProducts();

            for (int i = 0; i < webElementList2.size(); i++) {

                WebElement webElementItemName = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                String itemName = webElementItemName.getText();

                if (itemName.equals(name)) {
                    WebElement btnAddToCart = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                    btnAddToCart.click();
                    break;

                }
            }
        }
    }

    public void addItemToCartByName(Product product) throws InterruptedException {

        List<WebElement> webElementList = this.getProducts();
        for (int i = 0; i < webElementList.size(); i++) {

            WebElement webElementItemName = webElementList.get(i).findElement(By.cssSelector("a[class='hrefch']"));

            String itemName = webElementItemName.getText();

            if (itemName.equals(product.getName())) {
                WebElement btnAddToCart = getProducts().get(i).findElement(By.cssSelector("a[class='hrefch']"));
                btnAddToCart.click();
                break;
            }
        }

        if (driver.getCurrentUrl().equals("https://www.demoblaze.com/")) {

            driver.findElement(By.cssSelector("button[id='next2']")).click();
            Thread.sleep(4000);
            List<WebElement> webElementList2 = this.getProducts();

            for (int i = 0; i < webElementList2.size(); i++) {

                WebElement webElementItemName = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                String itemName = webElementItemName.getText();

                if (itemName.equals(product.getName())) {
                    WebElement btnAddToCart = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                    btnAddToCart.click();
                    break;
                }
            }
        }

        if (driver.getCurrentUrl().equals("https://www.demoblaze.com/index.html")) {
            driver.findElement(By.cssSelector("button[id='next2']")).click();
            Thread.sleep(4000);
            List<WebElement> webElementList2 = this.getProducts();

            for (int i = 0; i < webElementList2.size(); i++) {

                WebElement webElementItemName = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                String itemName = webElementItemName.getText();

                if (itemName.equals(product.getName())) {
                    WebElement btnAddToCart = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                    btnAddToCart.click();
                    break;
                }
            }
        }
    }

    public List<WebElement> getProducts() {
        return driver.findElements(By.cssSelector("div[class='col-lg-9'] div[class*='col-lg-4']"));

    }

    public boolean verifyIsWelcomeBtnPresent() {

        if (getWelcomeTestBtn().isDisplayed()) {

            return true;
        } else return false;


    }

    public String getAlertTextMsg() {
        return driver.switchTo().alert().getText();
    }

    public int getPriceOfChosenProduct(String name) throws InterruptedException {

        int toReturn = 0;

        List<WebElement> webElementList = this.getProducts();

        for (int i = 0; i < webElementList.size(); i++) {

            WebElement webElementItemName = webElementList.get(i).findElement(By.cssSelector("a[class='hrefch']"));
            String itemName = webElementItemName.getText();

            if (itemName.equals(name)) {
                WebElement storePriceValueWebElement = getProducts().get(i).findElement(By.cssSelector("div[class*='col-lg-4'] h5"));
                String storePriceValue = storePriceValueWebElement.getText().split("\\$")[1];
                toReturn = Integer.parseInt(storePriceValue);
                break;

            }
        }

        if (toReturn == 0) {

            driver.findElement(By.cssSelector("button[id='next2']")).click();
            Thread.sleep(4000);
            List<WebElement> webElementList2 = this.getProducts();

            for (int i = 0; i < webElementList2.size(); i++) {

                WebElement webElementItemName = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                String itemName = webElementItemName.getText();

                if (itemName.equals(name)) {
                    WebElement storePriceValueWebElement = getProducts().get(i).findElement(By.cssSelector("div[class*='col-lg-4'] h5"));
                    String storePriceValue = storePriceValueWebElement.getText().split("\\$")[1];
                    toReturn = Integer.parseInt(storePriceValue);
                    break;
                }
            }
        }
        return toReturn;

    }

    public int getPriceOfChosenProduct(Product product) throws InterruptedException {

        int toReturn = 0;

        List<WebElement> webElementList = this.getProducts();

        for (int i = 0; i < webElementList.size(); i++) {

            WebElement webElementItemName = webElementList.get(i).findElement(By.cssSelector("a[class='hrefch']"));
            String itemName = webElementItemName.getText();

            if (itemName.equals(product.getName())) {
                WebElement storePriceValueWebElement = getProducts().get(i).findElement(By.cssSelector("div[class*='col-lg-4'] h5"));
                String storePriceValue = storePriceValueWebElement.getText().split("\\$")[1];
                toReturn = Integer.parseInt(storePriceValue);
                break;

            }
        }

        if (toReturn == 0) {

            driver.findElement(By.cssSelector("button[id='next2']")).click();
            Thread.sleep(4000);
            List<WebElement> webElementList2 = this.getProducts();

            for (int i = 0; i < webElementList2.size(); i++) {

                WebElement webElementItemName = webElementList2.get(i).findElement(By.cssSelector("a[class='hrefch']"));
                String itemName = webElementItemName.getText();

                if (itemName.equals(product.getName())) {
                    WebElement storePriceValueWebElement = getProducts().get(i).findElement(By.cssSelector("div[class*='col-lg-4'] h5"));
                    String storePriceValue = storePriceValueWebElement.getText().split("\\$")[1];
                    toReturn = Integer.parseInt(storePriceValue);
                    break;
                }
            }
        }
        return toReturn;

    }


}
