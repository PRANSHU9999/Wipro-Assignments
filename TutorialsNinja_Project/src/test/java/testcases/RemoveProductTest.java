package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;

public class RemoveProductTest extends BaseClass 
{

    @Test
    public void verifyRemoveProduct() 
    {

        CartPage cp = new CartPage(driver);

        cp.enterProductName("iPhone");

        cp.clickSearchButton();

        cp.clickAddToCart();

        cp.clickCartButton();

        cp.clickViewCart();

        cp.clickRemoveButton();

        Assert.assertTrue(cp.isCartEmptyMessageDisplayed());
    }
}