package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ExcelUtility;

public class StudentSteps 
{

    @Given("user reads student data from excel")
    public void user_reads_student_data_from_excel() 
    {
        ExcelUtility.getStudentData();
    }

    @Then("student data should print successfully")
    public void student_data_should_print_successfully() 
    {
        System.out.println("Student data printed successfully");
    }
}