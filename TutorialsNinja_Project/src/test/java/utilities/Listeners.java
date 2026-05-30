package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners implements ITestListener 
{

    ExtentReports extent = ExtentReportManager.getReportInstance();

    ExtentTest test;

    public void onTestStart(ITestResult result) 
    {

        test = extent.createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) 
    {

        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) 
    {

        test.fail("Test Failed");
    }

    public void onFinish(ITestContext context) 
    {

        extent.flush();
    }
}