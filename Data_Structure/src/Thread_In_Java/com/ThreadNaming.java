package Thread_In_Java.com;

class namingmethod extends Thread{
	public void run() {
		System.out.println("current thread name by default given by JVM :" + Thread.currentThread().getName());
		Thread.currentThread().setName("Satyajit");
		System.out.println("After changed current thread name :" + Thread.currentThread().getName());
	}
}
public class ThreadNaming {

	public static void main(String[] args) {
		System.out.println("current thread name :" + Thread.currentThread().getName());
		Thread.currentThread().setName("Sipun");
		System.out.println("After changed the name " + Thread.currentThread().getName());
		namingmethod nm = new namingmethod();
		nm.start();
		

	}

}
