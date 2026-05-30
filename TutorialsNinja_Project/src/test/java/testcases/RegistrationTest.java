package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.RegisterPage;

public class RegistrationTest extends BaseClass 
{

    @Test
    public void verifyRegistration() 
    {

        RegisterPage rp = new RegisterPage(driver);

        rp.clickMyAccount();

        rp.clickRegister();

        rp.enterFirstName("Pranshu");

        rp.enterLastName("Mishra");

        String email = "pranshu" + System.currentTimeMillis() + "@gmail.com";

        rp.enterEmail(email);

        rp.enterTelephone("9876543210");

        rp.enterPassword("test123");

        rp.enterConfirmPassword("test123");

        rp.clickPrivacyPolicy();

        rp.clickContinueButton();

        String expectedTitle = "Your Account Has Been Created!";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}