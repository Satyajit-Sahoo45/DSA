import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int m =sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		for(int i=0;i<n;i++) {
			arr1[i]= sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr2[i] = sc.nextInt();
		}
		merge(arr1,arr2,n,m);
	}

	private static void merge(int[] arr1, int[] arr2, int n, int m) {
		int temp[] =  new int[n+m+1];
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
        
        for(int i=0;i<n;i++) {
        	temp[i] = arr1[i];
        	count++;
        }
        for(int j=0;j<m;j++) {
        	temp[++count] = arr2[j];
        }
        Arrays.sort(temp);
        for(int i=1;i<temp.length;i++) {
        	System.out.print(temp[i] + " ");
        }
	}

}
