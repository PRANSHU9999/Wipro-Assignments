package stepdefinitions;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps extends BaseClass 
{

    SearchPage sp;

    @When("user enters product name in search box")
    public void user_enters_product_name_in_search_box() 
    {
        sp = new SearchPage(driver);

        sp.enterProductName("iPhone");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() 
    {
        sp.clickSearchButton();
    }

    @Then("searched product should be displayed")
    public void searched_product_should_be_displayed() 
    {
        Assert.assertTrue(sp.isProductDisplayed());
        System.out.println("product searched");
    }
}