import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//
//     	}
		int d=0;
		for(int i=0;i<n;i++) {
			d+=arr[i][i];
		}
//		System.out.println(d1);
		int max=arr[0][0];
	for(int i=0;i<n;i++) {
		if(arr[i][i] >max) {
			max=arr[i][i];
		}
	}
	/**********SUM OF TWO MATRIX***************/
	  int d1=0;
      int d2=0;
      for (int i = 0; i < arr.length; i++) 
      { 
          for (int j = 0; j < arr.length; j++) 
          { 
              if (i == j) {
                  d1 += arr[i][j];
              }
             
              if (i == arr.length - j - 1) {
                  d2 += arr[i][j]; 
//                  System.out.println("arr : " + arr.length);
              }
          } 
      } 
      /*********************************/
      System.out.println(d1+d2);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(d);
		al.add(max);
		
		System.out.println(al + " ");
	}
	
	}
