package Thread_In_Java.com;

class DemonThread implements Runnable {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This a Demon Thread");
		}
		else {
			System.out.println("not a Daemon Thread");
		}
	}
}
public class DeamonThreadDemo {

	public static void main(String[] args) {
		System.out.println("This is main() method");
		
		DemonThread dt = new DemonThread();
	    Thread th = new Thread(dt);
	    th.setDaemon(true);
	    th.start();
	}

}
