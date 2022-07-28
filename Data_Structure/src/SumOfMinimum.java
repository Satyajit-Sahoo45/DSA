import java.util.Arrays;
import java.util.Scanner;

public class SumOfMinimum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n =sc.nextInt();
		 int[] arr = new int[n];
		 
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 System.out.println(sol(arr,n));

		 sc.close();
	}

	public static long sol(int[] arr, int n) {
		Arrays.sort(arr);
		long min1=0;
		long min2=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
	             min1 = min1*10+arr[i];
	             }
	         else {
	        	 min2 = min2*10+arr[i];
	         }
	     }
	     return min1+min2;
	}

}
