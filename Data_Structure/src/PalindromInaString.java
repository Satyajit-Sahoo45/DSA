import java.util.Scanner;

public class PalindromInaString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String str =sc.next();
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		
//		nextPalindriom(str);
		
		if(reverse.equals(str)) {
			System.out.println(str + "," + " yes ! it is a palindrom string");
		}
		else {
			System.out.println(str + " is Not a palindrom string");
		}
		sc.close();

	}

//	public static void nextPalindriom(String str) {
//		int length = str.length();
//		int[] hp = new int[length];
//		
//		int temp=0;
//		
//		int i=0;
//		int j=length-1;
//		
//		if(i <= j) {
//			temp = hp[i];
//			hp[i] = hp[i+1];
//			hp[i+1] = temp;
//			i++;
//			i++;
//			i++;
//		}
////		for(int i1=0;i1<length;i1++) {
////			System.out.print(hp[i] + " ");
//		}
//	}
}
