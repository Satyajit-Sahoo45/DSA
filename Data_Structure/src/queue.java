
public class queue {
	int data;
	int front;
	int rear;
	int size;
	int Queue[] = new int[5];
	
	public void enQueue(int data) {
		Queue[rear]=data;
		rear++;
		size++;
	}
	public int deQueue() {
		int data = Queue[front];
		front++;
		size--;
		return data;
	}
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(Queue[front+i] + " ");
		}
		System.out.println();
	}
//	public boolean isFull() {
//		return size==5;
//	}
//	public int getsize() {
//		return size;
//	}
//	public boolean isEmpty() {
//		return getsize()==0;
//	}
	
	public static void main(String[] args) {
		queue obj = new queue();
		
		obj.enQueue(87);
		obj.enQueue(76);
		obj.enQueue(90);
		
		obj.deQueue();
//		obj.deQueue();
		
		obj.show();
		
//		System.out.println("empty " + obj.isEmpty());
//		System.out.println("size " + obj.getsize());

	}
}
