import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t=sc.nextInt(); //test cases.
//		while(t-- > 0) {
			int n =sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(find(arr));
//			}
	}

	public static int find(int[] arr) {
		int temp=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				temp=arr[i];
				break;
			}
		}
	return temp;
	}

}
