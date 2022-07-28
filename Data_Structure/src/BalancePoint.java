import java.util.Scanner;

public class BalancePoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0;i<arr.length/2;i++) {
			sum1+=arr[i];
		}
		int mdl = arr.length/2;
		for(int j=mdl+1;j<=n-1;j++) {
			sum2+=arr[j];
		}
		if(sum1 == sum2) {
			System.out.println("sum1 :" + sum1 + " & " + "sum2 :" + sum2 + " balancing point is :" + mdl);
		}
	}

}
