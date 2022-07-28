package Basic_Prog.com;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctElement {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int n =sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		Solution(arr,k);
	}

	public static void Solution(int[] arr,int k) {
		HashMap<Integer,Integer> hm =  new HashMap<>();
		for(int i=0;i<k;i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
		}
		System.out.print(hm.size() + " ");
		
		for(int i=k;i<arr.length;i++) {
			if(hm.get(arr[i-k])==1) {
				hm.remove(arr[i-k]);
			}
			else {
				hm.put(arr[i-k],hm.get(arr[i-k])-1);
			}
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
			System.out.print(hm.size() + " ");
		}
	}

}
