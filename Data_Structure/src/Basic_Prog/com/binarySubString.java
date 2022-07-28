package Basic_Prog.com;

import java.util.Scanner;

/*
 * count the number of Sub Strings that start and end with 1
 */
public class binarySubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		String s = sc.next();
		
		
		System.out.println(Solution(n,s));

	}

	private static int Solution(int n, String str) {
		 int count = 0;
         for(int i=0; i<n; i++){
              if(str.charAt(i)=='1'){
                count++;
              }
         }
    
       int total = count*(count-1)/2;
       
       return total;
	}

}
