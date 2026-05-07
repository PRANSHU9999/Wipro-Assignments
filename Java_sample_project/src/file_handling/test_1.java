package file_handling;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class test_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("src\\file_handling\\sample.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
