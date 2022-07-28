import java.util.Scanner;

public class ColockWiseRotaate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		rotate(arr,n,t);
//		System.out.println(result);
	}

	public static void rotate(int[] arr, int n, int t) {
		long temp1;
		int s= arr[n-1];
		for(int i=s-1; i>0; i--){
		temp1=arr[i-1];
		arr[i-1]=arr[i];
		arr[i]=(int) temp1;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
