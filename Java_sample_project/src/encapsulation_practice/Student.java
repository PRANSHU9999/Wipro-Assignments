package encapsulation_practice;


public class Student {
	protected String name;
	public int rollno=101;
	String getname()
	{
		return name;
	}
	
	void setname(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		String stname=st.getname();
		System.out.println(stname);
        System.out.println(st.rollno);
	}

}
