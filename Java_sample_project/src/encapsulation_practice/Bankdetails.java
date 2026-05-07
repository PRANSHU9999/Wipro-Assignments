package encapsulation_practice;
import encapsulation_practice.Student;
class BankAccount
{
	private double balance;
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("Deposited: " + amount);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Withdrawn:"+amount);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}


public class Bankdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount acc=new BankAccount();

acc.deposit(1000);
acc.withdraw(2000);

System.out.println("Balance="+acc.getBalance());
Student st=new Student();
System.out.println(st.rollno);
System.out.println(st.name);

	}

}
