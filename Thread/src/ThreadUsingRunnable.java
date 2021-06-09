class ThreadPrRunnable1 implements Runnable{
	public void run() {
		int i = 0;
		while(i<1000) {
			System.out.println("a");
			i++;
		}
	}
}

class ThreadPrRunnable2 implements Runnable{
	public void run() {
		int i = 0;
		while(i<1000) {
			System.out.println("b");
			i++;
		}
	}
}

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		ThreadPrRunnable1 t1 = new ThreadPrRunnable1();
		Thread th1 = new Thread(t1);
		ThreadPrRunnable2 t2 = new ThreadPrRunnable2();
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
	}

}
