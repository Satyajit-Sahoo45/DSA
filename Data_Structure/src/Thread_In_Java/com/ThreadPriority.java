package Thread_In_Java.com;

class priority implements Runnable{
	public void run() {
		System.out.println("priority :" + Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		System.out.println("by default priority for main() given by JVM :" + Thread.currentThread().getPriority());
		
		priority p = new priority();
		Thread th = new Thread(p);
		th.setPriority(7);
		th.start();

	}

}
