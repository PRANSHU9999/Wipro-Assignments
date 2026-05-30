package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.SearchPage;

public class SearchTest extends BaseClass 
{

    @Test
    public void verifyProductSearch() 
    {

        SearchPage sp = new SearchPage(driver);

        sp.enterProductName("iPhone");

        sp.clickSearchButton();

        Assert.assertTrue(sp.isProductDisplayed());
    }
}