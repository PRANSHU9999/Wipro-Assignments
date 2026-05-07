package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class complete_file_practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("Text.txt");
		if(file.createNewFile())
		{
			System.out.println("File created successfully");
		}
		else 
		{
            System.out.println("File already exists");
        }
		
		
		FileWriter wr=new FileWriter("Text.txt");
		wr.write("Let's learn Java Programming\nSelenium Automation\n");
		wr.close();
		
		FileReader reader=new FileReader("Text.txt");
		int data;	
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		reader.close();
		
		if(file.delete())
		{
			System.out.println("\nFile deleted");
		}
		else 
		{
            System.out.println("Failed to delete");
		}
		
		if (file.exists()) 
		{
            System.out.println("File still exists");
        } 
		else 
		{
            System.out.println("File not found");
        }
	}
}
