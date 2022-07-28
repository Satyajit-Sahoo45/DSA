import java.util.*;

public class PowerSet {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int index =0;
		String cur="";
		Solution(str,index,cur);
		
		sc.close();
	}

	public static void Solution(String str, int index,String cur) {
		if(index == str.length()) {
			System.out.print(cur + ", ");
			return;
		}
		Solution(str,index+1,cur+str.charAt(index));
		Solution(str,index+1,cur);
	}

}
