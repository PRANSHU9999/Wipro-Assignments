package sample_package;

public class local_global_static {
		int globalvar=1111;
		static String name="USE_LESS_MEMORY";//WOUA
		double pi=3.14d; 
		
		void meth(String lv,int no)
		{
			System.out.println("name="+name);//not creating new memory
			System.out.println("this is a local variable->"+lv);
			System.out.println("this is for example->"+no);
		}
		void fun(int num,String eg)
		{
			System.out.println("this is a gloable var"+globalvar);
			System.out.println("example->"+num);
			System.out.println("String example->"+eg);
			System.out.println(pi);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			local_global_static obj=new local_global_static();
			obj.meth("Local_var",101);
			obj.fun(222,"this_is_a_string");
	}

}
