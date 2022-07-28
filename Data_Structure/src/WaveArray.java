import java.util.*;

public class WaveArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();//size of an array.
		
		int []arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			i++;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}