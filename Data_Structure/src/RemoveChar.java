import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		String result = CharRemove(s1,s2);
		System.out.println(result );

	}

	public static String CharRemove(String s1, String s2) {
		String result="";
		if(s1.length() > s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(!s2.contains(String.valueOf(s1.charAt(i)))) {
					result += String.valueOf(s1.charAt(i));
				}
			}
		}
		s1=result;
		return s1;
	}

}
