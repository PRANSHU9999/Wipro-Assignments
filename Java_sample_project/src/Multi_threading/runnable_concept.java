package Multi_threading;

public class runnable_concept implements Runnable {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "=" + i);
        }
    }

    public static void main(String[] args) {
        runnable_concept t0 = new runnable_concept();
        runnable_concept t1 = new runnable_concept();

        Thread th1 = new Thread(t0);
        Thread th2 = new Thread(t1);

        th1.start();
        th2.start();

        System.out.println(t0.equals(t1));
    }
}