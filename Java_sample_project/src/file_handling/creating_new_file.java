package file_handling;
import java.io.File;
import java.io.IOException;
public class creating_new_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("sammmmmple.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
	}

}
