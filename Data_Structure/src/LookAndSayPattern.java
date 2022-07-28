import java.util.Scanner;

public class LookAndSayPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(saypattern(n));
		
		sc.close();
	}

	public static String saypattern(int n) {
		if(n==1) {
			return "1";
		}
		if(n==2) {
			return "11";
		}
		String str = "11";
		
		str +="$";
		int length = str.length();
		char[] arr =str.toCharArray();
		int count = 1;
		String temp="";
		
		for(int i=3;i<=n;i++) {
			for(int j=1;j<length;j++) {
				if(arr[j] != arr[j-1]) {
					temp+=count+0;
					temp+=arr[j-1];
					
					count=1;
				}else {
					count++;
				}
				str = temp;
			}
		}
		return str;
	}

}
