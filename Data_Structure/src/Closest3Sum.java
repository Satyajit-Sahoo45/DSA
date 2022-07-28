import java.util.Arrays;
import java.util.Scanner;

public class Closest3Sum {

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int x = sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(Solution(arr,x));
		
		sc.close();
	}

	public static int Solution(int[] arr, int x) {		
		int result = arr[0]+arr[1]+arr[arr.length-1];
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-2;i++) {
			int a = i+1;
			int b = arr.length-1;
			
			while(a<b) {
				int currentSum = arr[i]+arr[a]+arr[b];
				if(a<b) {
					b--;
				}else {
					a++;
				}
				if(Math.abs(currentSum-x) < Math.abs(result-x)) {
					result = currentSum;
				}
		  }
	   }
		return result;

   }
}
