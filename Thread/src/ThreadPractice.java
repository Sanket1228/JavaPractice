class ThreadPr1 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<10000) {
			System.out.println("a");
			i++;
		}
	}
}

class ThreadPr2 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<10000) {
			System.out.println("b");
			i++;
		}
	}
}


public class ThreadPractice {

	public static void main(String[] args) {
		ThreadPr1 th1 = new ThreadPr1();
		ThreadPr2 th2 = new ThreadPr2();
		th1.start();
		th2.start();
	}

}
