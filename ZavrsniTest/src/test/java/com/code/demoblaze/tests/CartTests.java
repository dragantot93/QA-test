package com.code.demoblaze.tests;

import com.code.demoblaze.models.Product;
import com.code.demoblaze.models.User;
import com.code.demoblaze.pages.CartPage;
import com.code.demoblaze.pages.MainPage;
import com.code.demoblaze.pages.ProductPage;
import com.code.demoblaze.provider.ProductsProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartTests extends BaseTest {

    // Drugi zadatak (dodavanje svih proizvoda u slučaju da se korpa prethodno očisti, pa potom uporediti Total price)
    @Test
    public void verifyTotalPriceAddingAllProductItemsAfterClearCart() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        CartPage cartPage = new CartPage(driver);
        mainPage.openCartPage();
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);

        mainPage.addItemToCartByName(new Product("Samsung galaxy s6"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Nokia lumia 1520"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Nexus 6"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Samsung galaxy s7"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Iphone 6 32gb"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Sony xperia z5"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("HTC One M9"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Sony vaio i5"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Sony vaio i7"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Apple monitor 24"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("MacBook air"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Dell i7 8gb"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("2017 Dell 15.6 Inch"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("ASUS Full HD"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("MacBook Pro"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        productPage.openCartPage();

        Assert.assertTrue(cartPage.verifyIfProductsPriceEqualsTotalPrice());

    }

    // Drugi zadatak (dodavanje svih proizvoda i u slučaju kada nešto već postoji u korpi, pa potom uporediti Total price)
    @Test
    public void verifyTotalPriceAddingAllProductItems() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        ProductPage productPage = new ProductPage(driver);

        mainPage.addItemToCartByName(new Product("Samsung galaxy s6"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Nokia lumia 1520"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Nexus 6"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Samsung galaxy s7"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Iphone 6 32gb"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Sony xperia z5"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("HTC One M9"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Sony vaio i5"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Sony vaio i7"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Apple monitor 24"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("MacBook air"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Dell i7 8gb"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("2017 Dell 15.6 Inch"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("ASUS Full HD"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("MacBook Pro"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        productPage.openCartPage();

        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.verifyIfProductsPriceEqualsTotalPrice());

    }

    // Drugi zadatak (dodavanje svih proizvoda, jedan po jedan, i nakon svakog dodavanja novog proizvoda, uporediti Total price)
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyTotalPriceAddingAllItemsOneByOne(String productName) throws InterruptedException {

        //U ovom testu nije bitno koliko ima prethodno Itema u korpi

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        ProductPage productPage = new ProductPage(driver);

        mainPage.addItemToCartByName(new Product(productName));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();

        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.verifyIfProductsPriceEqualsTotalPrice());
    }

    // Drugi zadatak (dodavanje samo jednog proizvoda i upoređivanje Total price)
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyTotalPriceAfterAddingSingleItem(String productName) throws InterruptedException {

        //U ovom testu je bitno da se samo jedan Item nalazi u korpi

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);
        mainPage.addItemToCartByName(new Product(productName));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();

        Assert.assertTrue(cartPage.verifyIfProductsPriceEqualsTotalPrice());
    }

    // Test nije vezan za zadatke
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyIsPriceOfAddedItemSameAsPriceInCartTable(String productName) throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);
        int priceOfAddedItem = mainPage.getPriceOfChosenProduct(new Product(productName));
        mainPage.addItemToCartByName(new Product(productName));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();

        Assert.assertEquals(cartPage.findAddedProductAndGetPrice(productName), priceOfAddedItem);
    }

    // Test nije vezan za zadatke
    @Test
    public void verifyArePricesOfAddedItemsSameAsPricesInCartTable() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        cartPage.clearCartAndReturnToMainPage();

        List<Integer> pricesOfAddedItems = new ArrayList<>();

        ProductPage productPage = new ProductPage(driver);

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct(new Product("Nexus 6")));
        mainPage.addItemToCartByName(new Product("Nexus 6"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct(new Product("Samsung galaxy s6")));
        mainPage.addItemToCartByName(new Product("Samsung galaxy s6"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct(new Product("MacBook Pro")));
        mainPage.addItemToCartByName(new Product("MacBook Pro"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct(new Product("MacBook Pro")));
        mainPage.addItemToCartByName(new Product("MacBook Pro"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        productPage.openCartPage();

        List<Integer> expectedProductsInCart = cartPage.listOfProductPricesInCartTable();
        Collections.sort(expectedProductsInCart);
        Collections.sort(pricesOfAddedItems);

        Assert.assertEquals(expectedProductsInCart, pricesOfAddedItems);


    }

    // Treći zadatak (provera da li se proizvod nalazi u tabeli, a kada je korpa prazna)
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyIsAddedProductInCartTableAfterClearCart(String productName) throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);
        mainPage.addItemToCartByName(new Product(productName));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();

        Assert.assertTrue(cartPage.verifyIsAddedProductInCartTable(productName));
    }

    // Treći zadatak (provera da li se dodati proizvod nalazi u tabeli, čak i kada u korpi postoji neki proizvod)
    @Test
    public void verifyIsAddedProductInCartTable() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        ProductPage productPage = new ProductPage(driver);
        mainPage.addItemToCartByName(new Product("Nexus 6"));
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();

        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.verifyIsAddedProductInCartTable("Nexus 6"));
    }

    // Treći zadatak (provera da li se dodati proizvodi nalaze u tabeli, čak i kada u korpi postoji neki proizvod)
    @Test
    public void verifyAreAddedProductsInCartTable() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        ProductPage productPage = new ProductPage(driver);

        List<String> listaImenaProizvoda = new ArrayList<>();

        mainPage.addItemToCartByName(new Product("Apple monitor 24"));
        listaImenaProizvoda.add("Apple monitor 24");
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("MacBook air"));
        listaImenaProizvoda.add("MacBook air");
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Dell i7 8gb"));
        listaImenaProizvoda.add("Dell i7 8gb");
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        productPage.openCartPage();

        CartPage cartPage = new CartPage(driver);

        List<String> expectedProductsInCart = cartPage.listOfProductNamesInCartTable();

        Assert.assertTrue(expectedProductsInCart.containsAll(listaImenaProizvoda));


    }

    // Treći zadatak (provera da li se dodati proizvodi nalaze u tabeli, čak i kada u korpi postoji neki proizvod)
    @Test
    public void verifyAreAddedProductsInCartTableAfterClearCart() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        mainPage.login(new User("test", "test"));

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);

        List<String> listaImenaProizvoda = new ArrayList<>();

        mainPage.addItemToCartByName(new Product("Apple monitor 24"));
        listaImenaProizvoda.add("Apple monitor 24");
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("MacBook air"));
        listaImenaProizvoda.add("MacBook air");
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        mainPage.addItemToCartByName(new Product("Dell i7 8gb"));
        listaImenaProizvoda.add("Dell i7 8gb");
        productPage.clickBtnAddToCart();
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();

        productPage.openCartPage();

        List<String> expectedProductsInCart = cartPage.listOfProductNamesInCartTable();
        Collections.sort(expectedProductsInCart);
        Collections.sort(listaImenaProizvoda);

        Assert.assertEquals(expectedProductsInCart, listaImenaProizvoda);


    }


}
