package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class StudentTest 
{

    @DataProvider(name = "studentData")
    public Object[][] getData() 
    {

        return ExcelUtility.getStudentData();
    }

    @Test(dataProvider = "studentData")
    public void printStudentData(String name,
                                 String age,
                                 String city,
                                 String course,
                                 String phone) {

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("City: " + city);

        System.out.println("Course: " + course);

        System.out.println("Phone: " + phone);

        System.out.println("---------------------");
    }
}