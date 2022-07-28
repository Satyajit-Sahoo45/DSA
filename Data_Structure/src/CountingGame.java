import java.util.Scanner;

public class CountingGame {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();//size of an array.
	    String str = null;
		for(int i=0;i<n;i++) {
			str=sc.next();
		}
		countingWords(str);
	}
	public static void countingWords(String str) {
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))){
				count++;
			}
			System.out.println(count);
		}
	}
}
