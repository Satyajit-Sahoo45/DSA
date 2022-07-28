import java.util.Scanner;

public class MaximumInstructArray {
	int feet;
	int inches;
	int[][] arr =new int[feet][inches];
	public MaximumInstructArray(int feet,int inches) {
	   this.feet = feet;
	   this.inches=inches;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-- > 0) {
			int n =sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++) {
				int feet=sc.nextInt();
				int inches=sc.nextInt();
//				arr[i] = new MaximumInstructArray[feet,inches];
			}
		}
	}
}
