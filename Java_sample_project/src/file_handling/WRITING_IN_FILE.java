package file_handling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WRITING_IN_FILE {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File file=new File("demo.txt");//naming file
			file.createNewFile();
			FileWriter wr=new FileWriter("demo.txt");
			wr.write("Let's learn Java Angular,\nSelenium testing");
			wr.close();
			FileReader reader=new FileReader("demo.txt");
			int data;
			while((data=reader.read()) !=-1)
			{
				System.out.print((char)data);
			}
			reader.close();
	}

}
