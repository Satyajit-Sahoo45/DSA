import java.util.Scanner;

public class NeedsomeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		changeArray(arr,n);
		
	}

	public static void changeArray(int[] arr, int n) {
		
		for(int i=0;i<n-2;i++) {
			int temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
