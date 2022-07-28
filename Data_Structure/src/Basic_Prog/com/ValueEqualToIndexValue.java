package Basic_Prog.com;

import java.util.*;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> result =equalTo(arr,n);
		System.out.println(result);
	}

	public static ArrayList<Integer> equalTo(int[] arr, int n) {
		ArrayList<Integer> al =new ArrayList<>();
		for(int i=0;i<n;i++) {
		   if(i+1 == arr[i]) {
			   al.add(i+1);
		   }
		}
		return al ;
	}

}
