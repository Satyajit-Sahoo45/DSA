import java.util.*;

public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		
		while(t-- > 0) {
		 String s =sc.next();
		 char[] ch = s.toCharArray();
	        Arrays.sort(ch);
	        s = String.copyValueOf(ch);
	        System.out.println(s);
		}
	}

}
