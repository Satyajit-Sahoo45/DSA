package Basic_Prog.com;

import java.util.*;

public class LargestElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		kThLargestElements(arr,n,k);
		
	    sc.close();
	}

	public static void kThLargestElements(int[] arr, int n, int k) {
//		int temp=0;
//		  for(int i=0;i<n;i++) {
//		    	 for(int j=0;j<n-i-1;j++) {
//		    		 if(arr[j]<arr[j+1]) {
//		    			 temp=arr[j];
//		    			 arr[j]=arr[j+1];
//		    			 arr[j+1]=temp;
//		    		 }
//		    	 }
//		  }
	      Arrays.sort(arr);
	      int[] hello = new int[k];
	      
	      int j=0;
	      int i=n-1;
	      while(j<k){
	          hello[j]=arr[i];
	          j++;
	          i--;
	      }
		  for(int i1=0;i1<k;i1++) {
			  System.out.print(hello[i1]+ " ");
		  }
	}

}
