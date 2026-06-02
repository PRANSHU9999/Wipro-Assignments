package stepdefinitions;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class RegistrationSteps extends BaseClass 
{

    RegisterPage rp;

    @When("user navigates to registration page")
    public void user_navigates_to_registration_page() throws Exception 
    {

        rp = new RegisterPage(driver);

        rp.clickMyAccount();

        Thread.sleep(2000);

        rp.clickRegister();
    }

    @When("user enters registration details")
    public void user_enters_registration_details() 
    {

        rp.enterFirstName("Pranshu");

        rp.enterLastName("Mishra");

        String email = "pranshu"
                + System.currentTimeMillis()
                + "@gmail.com";

        rp.enterEmail(email);

        rp.enterTelephone("9876543210");

        rp.enterPassword("test123");

        rp.enterConfirmPassword("test123");

        rp.clickPrivacyPolicy();
    }

    @When("user clicks on Continue button")
    public void user_clicks_on_continue_button() 
    {

        rp.clickContinueButton();
    }

    @Then("account should be created successfully")
    public void account_should_be_created_successfully() 
    {

        Assert.assertTrue(
                driver.getTitle()
                        .contains("Your Account Has Been Created"));

        System.out.println("Registration done successfully");
    }
}