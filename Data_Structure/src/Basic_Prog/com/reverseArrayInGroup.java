package Basic_Prog.com;

import java.util.*;

public class reverseArrayInGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i += k)
        {
            int left = i;
      
            int right = Math.min(i + k - 1, n - 1);
            int temp;
              
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
