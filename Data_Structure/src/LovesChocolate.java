/*
 * size of an array : 5
 * input of an array: 5 3 1 6 9
 * output of an array: 1
 */
import java.util.*;

public class LovesChocolate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(chocoLates(arr));
		
		sc.close();
	}

	public static int chocoLates(int[] arr) {
		int sis=arr[0];
		for(int i = 1 ; i < arr.length ; i++ ) {
			if(arr[i] < sis) {
				sis=arr[i];
			}
		}
		return sis;
	}

}
