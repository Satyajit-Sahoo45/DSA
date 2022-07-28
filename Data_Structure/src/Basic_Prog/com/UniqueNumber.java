package Basic_Prog.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
        
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        for (int i =L; i<=R;i++){
        	boolean isUnique = checkUnique(i);
        	if(isUnique){
        	arr.add(i);
        	}
        }
        System.out.println(arr);
        
        sc.close();
	}
	
	private static boolean checkUnique(int num) {
		Set<Integer> numSet = new HashSet<>();

		while(num!=0){
			
			int r =num%10;
//			System.out.println("r : " + r);
			
			if(numSet.contains(r)){
			  return false;
			}
	
			numSet.add(r);
			num = num/10;
//			System.out.println("numSet : " + numSet);
//			System.out.println("num : " + num);
		}
		return true;
	}

}
