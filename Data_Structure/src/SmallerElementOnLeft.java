import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SmallerElementOnLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans = Solution(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(ans.get(i) + " ");
		}
	}

	private static ArrayList<Integer> Solution(int[] arr, int n) {
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Integer> stk = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			if(stk.isEmpty()) {
				stk.push(arr[i]);
				al.add(-1);
			}
			else if(stk.peek() < arr[i]) {
					al.add(stk.peek());
					stk.push(arr[i]);
			}
			else if(stk.peek() >= arr[i]) {
//				
				al.add(-1);
//				while(!stk.isEmpty() && stk.peek()>=arr[i]) {
//					stk.pop();
//				}
//				if(stk.isEmpty()) {
//					al.add(-1);
//				}else {
//					al.add(stk.peek());
//				}
				stk.push(arr[i]);
			}
		}
		return al;
	}

}
