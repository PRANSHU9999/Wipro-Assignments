package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;

public class AddToCartTest extends BaseClass 
{
    @Test
    public void verifyAddToCart() 
    {

        CartPage cp = new CartPage(driver);

        cp.enterProductName("iPhone");

        cp.clickSearchButton();

        cp.clickAddToCart();

        Assert.assertTrue(cp.isSuccessMessageDisplayed());
    }
}