import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = isStrong(n);
		System.out.println(result);
	}

	public static int isStrong(int n) {
		int sum=0;
		int temp=n;
		
		while(n!=0) {
			sum+=factorial(n%10);
			n/=10;
		}
		if(sum==temp) {
			return 1;
		}
		else {
		return 0;
		}
	}

	public static int factorial(int n) {
		if(n<= 1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
