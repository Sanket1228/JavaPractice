class Thr1 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("Welcome");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thr2 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("Thank You");
		}
	}
}

public class ThreadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thr1 t1 = new Thr1();
		Thr2 t2 = new Thr2();
		t1.start();
		t2.start();
	}
}
