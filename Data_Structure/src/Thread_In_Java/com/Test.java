package Thread_In_Java.com;

public class Test extends Thread{
	
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.start();
	}

}
