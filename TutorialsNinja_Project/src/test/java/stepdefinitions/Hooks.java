package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass 
{

    @Before
    public void startBrowser() 
    {

        setup();
    }

    @After
    public void closeBrowser() 
    {

        tearDown();
        System.out.println("Project Executed Successfully");
    }
}