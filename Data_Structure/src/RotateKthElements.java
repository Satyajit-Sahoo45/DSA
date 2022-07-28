import java.util.Scanner;

public class RotateKthElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int k=sc.nextInt();
	    int[] arr =new int[n];
	    
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    
	    rotate(arr,n,k);
	}

	public static void rotate(int[] arr, int n, int k) {
		
		int temp=arr[k-1];
		arr[k-1]=arr[n-k];
		arr[n-k]=temp;
//		if(arr[k-1]!=arr[n-k]){
//			arr[k-1] = arr[k-1]+arr[n-k];
//			arr[n-k] = arr[k-1]-arr[n-k];
//			arr[k-1] = arr[k-1]-arr[n-k];
//			}
		
		 for(int i=0;i<n;i++) {
		    	System.out.print(arr[i] + " ");
		    }
	}

}
