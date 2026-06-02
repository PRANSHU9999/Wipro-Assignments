package stepdefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseClass {

    @Given("user opens browser and launches website")
    public void user_opens_browser_and_launches_website() {

        System.out.println("URL = " + driver.getCurrentUrl());
        System.out.println("TITLE = " + driver.getTitle());

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src, new File("homepage.png"));

            System.out.println("Screenshot captured successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Tutorial Ninja Website Opened");
    }
}