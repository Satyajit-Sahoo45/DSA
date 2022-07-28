import java.util.*;

public class arrangeArrayAlternately {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arrangeArray(arr,n);
	}

	public static void arrangeArray(int[] arr, int n) {
		int max=arr[0];
		int max_ind=n-1;
		int min_ind=0;
		
		for(int i=1;i<n;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}
		int max_ele=max+1;
	    for(int i=0;i<n;i++) {
	    	if(i%2==0) {
	    	   arr[i]+=(arr[max_ind]%max_ele)*max_ele;
	    	   max_ind--;
	    	}
	    	else {
	    		arr[i]+=(arr[min_ind]%max_ele)*max_ele;
	    		min_ind++;
	    	}
	    }
	    for(int i=0;i<n;i++) {
	    	arr[i] /= max_ele;
	    }
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i] + " ");
	    }
	}

}
