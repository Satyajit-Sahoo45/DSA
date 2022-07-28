package Basic_Prog.com;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOfTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
//		int m =sc.nextInt();
		int brr[] = new int[n];
		for(int i=0;i<n;i++) {
			brr[i]=sc.nextInt();
		}
		
		Solution(arr,brr,n);
		
	}

	private static void Solution(int[] arr, int[] brr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum = arr[i] + brr[i];
            ArrayList<Integer> result = sumArray(sum);
            for(int j =0; j<result.size(); j++) {
            	System.out.print(result.get(j) + " ");
            }
//			System.out.print(sum + " ");
		}
	}

	private static ArrayList<Integer> sumArray(int sum) {
		ArrayList<Integer> al = new ArrayList<>();
		int div=0;
		int rem=0;
			
		div = sum/10;
		rem = sum%10;
		
		if(div != 0 && rem != 0) {
		 al.add(div);
		 al.add(rem);
		} else{
			if(div == 0) {
				al.add(rem);
			}else {
				al.add(div);
			}
		}
				
//	    System.out.println(al); 
		return al;
	}
}
