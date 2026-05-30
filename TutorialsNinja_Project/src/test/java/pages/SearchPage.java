package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.name("search");

    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    By product = By.linkText("iPhone");

    public void enterProductName(String productName) {

        driver.findElement(searchBox).sendKeys(productName);
    }

    public void clickSearchButton() {

        driver.findElement(searchButton).click();
    }

    public boolean isProductDisplayed() {

        return driver.findElement(product).isDisplayed();
    }
}