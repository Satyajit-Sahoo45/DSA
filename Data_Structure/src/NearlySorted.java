import java.util.*;

public class NearlySorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Sorted(arr,n,k);
		}
	}

	public static void Sorted(int[] arr, int n, int k) {
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
