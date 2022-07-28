package Basic_Prog.com;

import java.util.*;

public class MatrixInterchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		InterChange(arr,row,col);
		
		sc.close();
	}

	public static void InterChange(int[][] arr, int col, int row) {
		int t=0;
		for (int i= 0; i < row; i++) {
	         t = arr[i][0]; 
	        arr[i][0] = arr[i][col - 1]; 
	        arr[i][col - 1] = t; 
	         } 
		printArray(arr,col,row);
		  
		}

	public static void printArray(int[][] arr, int col, int row) {
		System.out.println("AFTER INTERCHANGE");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
		
	}

