package Multi_threading;

public class My_thread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		My_thread t0=new My_thread();
		t0.setPriority(10);  //low to high priority 1-lowest to 10-highest
		t0.start();
		t0.sleep(3000);
		My_thread t1=new My_thread();
		t1.start();
		My_thread t2=new My_thread();
		t2.start();
		System.out.println("current Priority for t2="+t2.getPriority());
		t2.setPriority(MAX_PRIORITY);
		System.out.println("after setting Priority for t2="+t2.getPriority());
		My_thread t3=new My_thread();
		t3.start();
		My_thread t4=new My_thread();
		t4.start();
		My_thread t5=new My_thread();;
		t5.start();
	}

}
