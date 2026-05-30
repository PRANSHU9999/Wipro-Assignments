package stepdefinitions;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartSteps extends BaseClass {

    CartPage cp;

    @When("user searches product")
    public void user_searches_product() {

        cp = new CartPage(driver);

        cp.enterProductName("iPhone");

        cp.clickSearchButton();
    }

    @When("user adds product to cart")
    public void user_adds_product_to_cart() {

        cp.clickAddToCart();
    }

    @Then("success message should be displayed")
    public void success_message_should_be_displayed() {

        Assert.assertTrue(cp.isSuccessMessageDisplayed());

        System.out.println("add to cart");
    }

    @Then("validate total amount")
    public void validate_total_amount() throws Exception {

        String total = cp.getTotalAmount();

        System.out.println("Total Amount: " + total);
    }

    @When("user proceeds to checkout")
    public void user_proceeds_to_checkout() {

        cp.clickCheckout();
    }

    @Then("checkout page should display")
    public void checkout_page_should_display() {

        Assert.assertTrue(
                driver.getCurrentUrl().contains("checkout"));

        System.out.println("Checkout Completed");
    }

    @When("user adds product into cart")
    public void user_adds_product_into_cart() {

        cp = new CartPage(driver);

        cp.enterProductName("iPhone");

        cp.clickSearchButton();

        cp.clickAddToCart();
    }

    @When("user removes product from cart")
    public void user_removes_product_from_cart() throws Exception {

        cp.clickCartButton();

        cp.clickViewCart();

        cp.clickRemoveButton();
    }

    @Then("cart should become empty")
    public void cart_should_become_empty() {

        Assert.assertTrue(cp.isCartEmptyMessageDisplayed());

        System.out.println("Product deleted");
    }
}