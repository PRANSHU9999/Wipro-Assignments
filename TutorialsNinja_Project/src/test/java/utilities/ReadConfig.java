package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{

    Properties pro;

    public ReadConfig() 
    {

        try {

            FileInputStream fis = new FileInputStream(
                    System.getProperty("user.dir")
                    + "/src/test/resources/config/config.properties");

            pro = new Properties();

            pro.load(fis);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public String getURL() 
    {
        return pro.getProperty("url");
    }

    public String getBrowser() 
    {
        return pro.getProperty("browser");
    }

    public String getEmail() 
    {
        return pro.getProperty("email");
    }

    public String getPassword() 
    {
        return pro.getProperty("password");
    }
}