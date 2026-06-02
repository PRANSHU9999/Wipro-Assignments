package stepdefinitions;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ReadConfig;

public class LoginSteps extends BaseClass 
{

    LoginPage lp;

    ReadConfig rc = new ReadConfig();

    @When("user clicks on My Account")
    public void user_clicks_on_my_account()
    {

        lp = new LoginPage(driver);

        lp.clickMyAccount();
    }

    @When("user clicks on Login")
    public void user_clicks_on_login() 
    {

        lp.clickLogin();
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password()
    {

        lp.enterEmail(rc.getEmail());

        lp.enterPassword(rc.getPassword());
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() 
    {

        lp.clickLoginButton();
    }

    @Then("user should navigate to My Account page")
    public void user_should_navigate_to_my_account_page()
    {

    	Assert.assertTrue(lp.isLogoutDisplayed());
        System.out.println("Logged in successfully");
    }
}