package Basic_Prog.com;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class GeeksForGeeks {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n =sc.nextInt();
		String str = sc.next();
		
		System.out.println(Solution(str));
		
	}

	private static String Solution(String str) {
		 Queue<Character> lower = new PriorityQueue<>();
	        Queue<Character> upper = new PriorityQueue<>();
	        
	        for(int i = 0; i < str.length(); ++i) {
	            
	            if(Character.isLowerCase(str.charAt(i)))
	                lower.add(str.charAt(i));
	            else
	                upper.add(str.charAt(i));
	        }
	        
	        String ans = "";
	        
	        for(int i = 0; i < str.length(); ++i) {
	            char c = str.charAt(i);
	            
	            if(Character.isLowerCase(c))
	                ans += lower.remove();
	            else
	                ans += upper.remove();
	        }
	        
	        return ans;
	}

}
