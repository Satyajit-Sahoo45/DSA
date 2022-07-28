import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		solution(arr);
	}

	private static void solution(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int[] result = new int[arr.length];
		
		for(int j=arr.length-1; j>=0; j--) {
			if(!s.isEmpty()) {
				while(!s.isEmpty() && s.peek() <= arr[j]) {
					s.pop();
				}
			}
				result[j] = s.isEmpty() ? -1 : s.peek(); 
				
				s.push(arr[j]);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ---> " + result[i]);
		}
		
	}

}
