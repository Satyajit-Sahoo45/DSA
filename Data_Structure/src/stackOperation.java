import java.util.Scanner;
import java.util.Stack;

public class stackOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<n;i++) {
			int element=arr[i];
			
			System.out.println("pushed elements : " + stack.push(element) + " ");
		}
		System.out.println("popped element : " + stack.pop() + " ");
	}

}
