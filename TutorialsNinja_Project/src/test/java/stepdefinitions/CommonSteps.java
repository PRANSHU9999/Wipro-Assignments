package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseClass 
{

    @Given("user opens browser and launches website")
    public void user_opens_browser_and_launches_website() 
    {

        System.out.println("Tutorial Ninja Website Opened");
    }
}