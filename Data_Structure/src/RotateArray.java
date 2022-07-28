import java.util.*;

public class RotateArray {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t=sc.nextInt();
//		while(t-- > 0) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			rotate(arr,p);
			printArray(arr,n);
			
			sc.close();
//		}
	}

	public static void rotate(int[] arr, int p) {
		p=p%arr.length;
		if(p < 0) {
			p+=arr.length;
		}
		//left
		reverse(arr,0,arr.length-p-1);
		
		//right
		reverse(arr,arr.length-p,arr.length-1);
		
		//all
		reverse(arr,0,arr.length-1);
	}


	public static void reverse(int[] arr, int i, int j) {
		int li=i;
		int ri=j;
		int temp=0;
		while(li < ri) {
			temp=arr[li];
			arr[li]=arr[ri];
			arr[ri]=temp;
			
			li++;
			ri--;
			
		} 
	}

	public static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
