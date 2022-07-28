import java.util.*;

public class subArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		String[] str = new String[n];
//		for(int i=0;i<str.length;i++) {
//			str[i]=sc.next();
//		}
		
//		for(int i=0;i<str.length;i++) {
//			for(int j=i;j<str.length;j++) {
//				for(int k=i;k<=j;k++) {
//					System.out.print(str[k]);
//				}
//				System.out.println();
//			}
//		}
		
		String s = sc.next();
		
		List<String> ll = Solution(s);
		
		System.out.println(ll);
		
		
		sc.close();
	}

	private static List<String> Solution(String s) {
		List<String> str = new ArrayList<>();
		
		answer(s ," ", str);
		Collections.sort(str);
		return str;
	}

	private static void answer(String s, String ans, List<String> str) {
		if(s.length() == 0 ) {
			str.add(ans);
			return ;
		}
		
		for(int i=0;i<s.length();i++) {
			answer(s.substring(0, i) + s.substring(i+1) , ans+s.charAt(i), str);
		}
	}

}
