package Basic_Prog.com;

import java.util.Scanner;

public class convertString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer newStr = new StringBuffer(str);	
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
		   if(Character.isLowerCase(ch)) {
			   newStr.setCharAt(i, Character.toUpperCase(ch));
		   }
		   
		   else if(Character.isUpperCase(ch)) {
			   newStr.setCharAt(i, Character.toLowerCase(ch));
		   }
		}
		
		System.out.println(newStr);
	}

}