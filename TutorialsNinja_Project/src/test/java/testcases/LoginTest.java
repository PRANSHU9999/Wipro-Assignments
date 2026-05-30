package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utilities.ReadConfig;
import utilities.Screenshot;

public class LoginTest extends BaseClass 
{

    @Test
    public void verifyLogin() 
    {

        ReadConfig rc = new ReadConfig();

        LoginPage lp = new LoginPage(driver);

        lp.clickMyAccount();

        lp.clickLogin();

        lp.enterEmail(rc.getEmail());

        lp.enterPassword(rc.getPassword());

        lp.clickLoginButton();
        
        String expectedTitle = "My Account";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        
        Screenshot.captureScreenshot(driver, "LoginTest");
    }
}