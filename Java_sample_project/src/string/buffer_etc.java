package string;

public class buffer_etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Selenium";
		System.out.println(str);
		
		//Convert immutable string to mutable string
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb);
		
		//Convert mutable String to immutable String
		String str1=new String(sb);
	}

}
