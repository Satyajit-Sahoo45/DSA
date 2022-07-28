import java.util.Scanner;

public class NumbersInString {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		String S1 = sc.next();
		String temp ="0";
		int sum=0;
		for(int i=0;i<S1.length();i++) {
			char ch = S1.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
			}
			else {
				sum+=Math.abs(Integer.parseInt(temp));
				temp="0";
			}
		}
		System.out.println(sum+Integer.parseInt(temp)); 
		sc.close();
	}

}
