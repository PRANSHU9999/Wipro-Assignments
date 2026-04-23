package control_session;
import java.util.Scanner;
public class switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dresssize=sc.nextInt();
		
		switch(dresssize)
		{
		case 26:System.out.println("XS");
		break;
		case 28:System.out.println("S");
		break;
		case 30:System.out.println("M");
		break;
		case 32:System.out.println("L");
		break;
		case 34:System.out.println("XL");
		break;
		default:System.out.println("Invalid size");
		}
	}

}
