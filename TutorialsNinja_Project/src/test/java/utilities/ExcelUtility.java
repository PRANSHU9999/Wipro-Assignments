package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{

    public static Object[][] getStudentData() 
    {

        Object[][] data = null;

        try {

            FileInputStream fis = new FileInputStream(
                    System.getProperty("user.dir")
                    + "/src/test/resources/testdata/StudentData.xlsx");

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int rows = sheet.getPhysicalNumberOfRows();

            int cells = sheet.getRow(0).getPhysicalNumberOfCells();

            data = new Object[rows - 1][cells];

            for (int i = 1; i < rows; i++) {

                for (int j = 0; j < cells; j++) {

                    data[i - 1][j] =
                            sheet.getRow(i).getCell(j).toString();
                }
            }

            workbook.close();

        } 
        catch (Exception e) 
        {

            e.printStackTrace();
        }

        return data;
    }
}