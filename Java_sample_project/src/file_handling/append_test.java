package file_handling;
import java.io.FileWriter;
import java.io.IOException;
public class append_test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("src//file_handling//sample.txt", true);
        fw.write("This is new appended text\n");
        fw.close();
        
        System.out.println("Text appended successfully");
	}

}
