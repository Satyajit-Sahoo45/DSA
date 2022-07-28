package Thread_In_Java.com;

public class Testt implements Runnable {
	
	public void run() {
		System.out.println("Thread is Running2");
		
	}
	public static void main(String[] args) {
		Testt t = new Testt();
		Thread th = new Thread(t);
		th.start();
	}

}
