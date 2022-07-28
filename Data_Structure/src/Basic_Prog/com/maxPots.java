package Basic_Prog.com;

import java.util.Arrays;
import java.util.Scanner;

public class maxPots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int indSum = 0;
	    
	    for(int i=0; i<n; i++) {
	    	arr[i] = sc.nextInt();
	    	indSum += i+1;
	    }
//	    System.out.println("indSum : " +indSum);
	    
	    Arrays.sort(arr);
	    int max = Integer.MIN_VALUE;
	    int remSoil = indSum;
	    
	    for(int i=0; i<arr.length; i++) {
//	    	System.out.print("indSum at " + i + " -> " + indSum + " - " + arr[i] + " = ");
	    	remSoil -= arr[i];
//	    	System.out.println(indSum);
	    	
	    	if(remSoil > 0) {
	    		if(arr[i] > max) {
	    			max = arr[i];
//	    			System.out.println("max : " +max);
	    		}
	    	}
	    	
	    }
	    
	    System.out.println(max);
	    
	}

}
