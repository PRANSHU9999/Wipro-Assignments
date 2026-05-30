package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitHelper;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    By myAccount = By.xpath("//span[text()='My Account']");

    By register =
            By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']");

    By firstName = By.id("input-firstname");

    By lastName = By.id("input-lastname");

    By email = By.id("input-email");

    By telephone = By.id("input-telephone");

    By password = By.id("input-password");

    By confirmPassword = By.id("input-confirm");

    By privacyPolicy = By.name("agree");

    By continueButton = By.xpath("//input[@value='Continue']");

    public void clickMyAccount() {

        driver.findElement(myAccount).click();
    }

    public void clickRegister() {

        WaitHelper wh = new WaitHelper(driver);

        wh.waitForClickableElement(register).click();
    }

    public void enterFirstName(String fname) {

        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {

        driver.findElement(lastName).sendKeys(lname);
    }

    public void enterEmail(String mail) {

        driver.findElement(email).sendKeys(mail);
    }

    public void enterTelephone(String phone) {

        driver.findElement(telephone).sendKeys(phone);
    }

    public void enterPassword(String pass) {

        driver.findElement(password).sendKeys(pass);
    }

    public void enterConfirmPassword(String cpass) {

        driver.findElement(confirmPassword).sendKeys(cpass);
    }

    public void clickPrivacyPolicy() {

        driver.findElement(privacyPolicy).click();
    }

    public void clickContinueButton() {

        driver.findElement(continueButton).click();
    }
}