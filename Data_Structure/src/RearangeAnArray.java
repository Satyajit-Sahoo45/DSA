   import java.util.*;
/*
 * Given an array arr[] of size N where every element is in the range from 0 to n-1.
 *  Rearrange the given array so that arr[i] becomes arr[arr[i]].
 *  
 *  input : 4 0 2 1 3
 *  output: 3 4 2 0 1
 */
public class RearangeAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int[] arr = new int[(int)n];
		
		for(int i=0;i<n;i++) {
			arr[(int)i]=sc.nextInt();
		}
		
		Solution(arr,n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Solution(int[] arr, int n) {         
         for(int i=0;i<n-1;i++) {
        	 arr[i]+=(arr[arr[i]]%n)*n;
         }
         for(int i=0;i<n-1;i++) {
        	 arr[i] /= n;
         }
//		int temp[] = new int[n];
//        int i;
// 
//        for (i = 0; i < n; i++)
//            temp[arr[i]] = i;
// 
//        for (i = 0; i < n; i++)
//            arr[i] = temp[i];
       	}

}
