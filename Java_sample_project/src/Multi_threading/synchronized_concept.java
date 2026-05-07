package Multi_threading;

public class synchronized_concept extends Thread {
	   int count = 0;

	    synchronized void count() {
	        count++;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		synchronized_concept t1 = new synchronized_concept();
	        t1.count();

	        synchronized_concept t2 = new synchronized_concept();
	        t2.count();
	}

}
