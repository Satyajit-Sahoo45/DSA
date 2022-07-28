package Basic_Prog.com;

import java.util.Scanner;

public class ReplaceBinaryCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		replace(n);
	}
	public static void replace(int n) {
	   String s = Integer.toBinaryString(n);
	   char c[] = s.toCharArray();
	   System.out.println("Before Replacing : " + s);
	   int sum=0;
	   for(int i=0;i<s.length();i++) {
		    if(i%2 == 0) {
		    	char ch = c[i];
		    	if(ch == '1') {
		    		c[i]='0';
		    	}
		    sum+=c[i];
		    }
	   }
	   
	   int count=0;
		   for(int i=0;i<c.length;i++) {
			   if(c[i] == '0') {
				   count++;
			   }
		   }
		   
		   if(count == s.length()) {
			   System.out.println("After Replacing : " + s);
		   }
		   else {
			   System.out.print("After Replacing : ");
			   for(int i=0;i<c.length;i++) {
				   System.out.print(c[i]);
			   }
		   }
	   
	}

}
