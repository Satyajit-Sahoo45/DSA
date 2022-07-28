package Basic_Prog.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * time complexity : O((m + n) * log n).
 * space complexity : O(1).
 */
public class CountingElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m= sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];
		
		for(int i=0;i<m;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			arr2[j]=sc.nextInt();
		}
		
		ArrayList<Integer> result =Solution(arr1,arr2,m,n);
		System.out.println(result);
		}

	public static ArrayList<Integer> Solution(int[] arr1, int[] arr2, int m, int n) {
		  Arrays.sort(arr2);
	       ArrayList<Integer> al = new ArrayList<>();
	       
	       for(int i=0;i<m;i++){
	           int index = firstelementLesserThanTheKey(arr2,arr1[i]+1,0,n-1);
	           al.add(index+1);
	       }
	       return al;
	}

	public static int firstelementLesserThanTheKey(int[] arr2, int key, int start, int end) {
		int pos =-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr2[mid] >= key){
                end=mid-1;
            }
            else{
                pos = mid;
                start = mid+1;
            }
        }
        return pos;
	}

}

//time complexity : O(n^2).
//ArrayList<Integer> al = new ArrayList<>();
//int count =0 ;
//
//for(int i=0;i<m;i++){
//	for(int j=0;j<n;j++){
//		if(arr2[j] <= arr1[i]){
//			count++;
//		}
//	}
//	al.add(count);
//	count=0;
//}
//return al;