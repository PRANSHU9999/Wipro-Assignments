package Keywords_practice;

public class Emp2 {

    static class Innerclass {
        void testt() {
            System.out.println("Inner class Method");
        }
    }

    int empid;
    String name;

    // static variable
    static String companyname = "Wipro";

    void show(int empid1, String name1) {
        empid = empid1;
        name = name1;

        System.out.println("empid= " + empid);
        System.out.println("name= " + name);
        System.out.println("companyname= " + companyname);
    }

    //static method
    static void details(int empid1, String name1) {
        String st;
        //System.out.println("empid= "+empid);
        //System.out.println("name= "+name);
        System.out.println("companyname= " + companyname);
    }

    //static block
    static {
        System.out.println("block");
    }

    {
        System.out.println("block");
    }

    public static void main(String[] args) {

        Emp2 emp = new Emp2();
        emp.show(101, "Rohit");
        emp.show(102, "Soham");
        emp.show(103, "Mohan");

        //show(103, "Mohan");
        details(101, "Rohit");
/*  🔑 Simple Meaning

👉 Inner class = helper class inside main class

⚡ Why static here?

👉 Because of static, you can use it without creating Emp object


🧠 1-Line Understanding

👉 Static inner class is just a class inside another class that you can use directly without creating outer class object.
*/
         Emp2.Innerclass test = new Emp2.Innerclass();
        test.testt();
    }
}