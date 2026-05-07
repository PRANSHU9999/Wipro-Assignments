package file_handling;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Buf_reader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1=new File("Text.txt");
		f1.createNewFile();
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
		bw.write("Java is one of the most popular programming languages used worldwide for building robust and scalable applications.\n"
				+ "Many developers prefer Java because Java is platform-independent,\n "
				+ "meaning code written in Java can run on different systems without modification.\n "
				+ "Java is widely used in web development, mobile applications, and enterprise software.\n "
				+ "Learning Java helps in understanding core programming concepts,\n "
				+ "and mastering Java can open many career opportunities. Overall, \n"
				+ "Java remains a powerful and reliable language,"
				+ " and Java continues to evolve with new features and improvements.");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
        String l1;
        String javapara="";
        String pythonpara="";

        while ((l1 = br.readLine()) != null) {
          javapara+=l1+"\n";
          pythonpara+=l1.replace("Java","Python")+"\n";
        }

        br.close();
        System.out.println(javapara);
        System.out.println(pythonpara);
	}

}
