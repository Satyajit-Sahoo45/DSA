package Basic_Prog.com;

import java.util.*;

public class StockSpan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Solution(arr,n);
		
	}

	public static void Solution(int[] arr, int n) {
		arr[0]=1;
		for(int i=1;i<n;i++) {
			arr[i]=1;
			for(int j=i-1;(j>=0 && arr[i] > arr[j]) ; j--) {
				arr[i]++;
			}
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
