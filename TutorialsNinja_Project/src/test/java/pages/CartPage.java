package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitHelper;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.name("search");

    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    By addToCartButton = By.xpath("(//span[text()='Add to Cart'])[1]");

    By successMessage = By.xpath("//div[contains(@class,'alert-success')]");

    By cartButton = By.id("cart-total");

    By viewCart = By.xpath("//strong[contains(text(),'View Cart')]");

    By removeButton =
            By.xpath("//button[contains(@data-original-title,'Remove')]");

    By emptyCartMessage =
            By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty')]");

    By totalAmount =
            By.xpath("//span[@id='cart-total']");

    By checkoutButton =
            By.linkText("Checkout");

    public void enterProductName(String productName) {

        driver.findElement(searchBox).sendKeys(productName);
    }

    public void clickSearchButton() {

        driver.findElement(searchButton).click();
    }

    public void clickAddToCart() {

        driver.findElement(addToCartButton).click();
    }

    public boolean isSuccessMessageDisplayed() {

        return driver.findElement(successMessage).isDisplayed();
    }

    public void clickCartButton() throws Exception {

        Thread.sleep(2000);

        driver.findElement(cartButton).click();
    }

    public void clickViewCart() {

        driver.findElement(viewCart).click();
    }

    public void clickRemoveButton() {

        WaitHelper wh = new WaitHelper(driver);

        wh.waitForClickableElement(removeButton).click();
    }

    public boolean isCartEmptyMessageDisplayed() {

        return driver.findElement(emptyCartMessage).isDisplayed();
    }

    public String getTotalAmount() throws Exception {

        Thread.sleep(2000);

        return driver.findElement(totalAmount).getText();
    }

    public void clickCheckout() {

        driver.findElement(checkoutButton).click();
    }
}