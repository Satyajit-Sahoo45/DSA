import java.util.Scanner;


public class LongestElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int result2 = findSmallest(arr,n);
		System.out.print("min = "+result2+ ", ");
		int result = findLargest(arr,n);
		System.out.print("max = "+result);
		sc.close();
	}
	public static int findSmallest(int[] arr, int n) {
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[(int) i] < min) {
				min = arr[(int) i];
			}
		}
		
		return min;
	}

	public static int findLargest(int[] arr, int n) {
		long max = arr[0];

		for(long i = 1; i < n ; i++)
		if(arr[(int) i] > max){
		max = arr[(int) i];
		}

		return (int)max;
	}
	

}
