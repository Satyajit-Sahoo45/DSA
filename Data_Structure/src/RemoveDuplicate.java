import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     String s = sc.next();
//		 char str[] = s.toCharArray(); 
//		 System.out.println(str);
	        int n = s.length(); 
	        System.out.println(removeDuplicate(s, n)); 
	}

	public static String removeDuplicate(String S, int n) {
		  LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	        char[] chars = S.toCharArray();
	        for (int i = 0; i < chars.length; i++) {
	            set.add(chars[i]);
	        }
	        Iterator<Character> iterator = set.iterator();
	        String sbString = "";
	        while (iterator.hasNext())
	            sbString += iterator.next();

	        return sbString;
	    }
	} 
