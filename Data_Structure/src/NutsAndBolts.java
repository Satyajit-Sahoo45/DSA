import java.util.*;
public class NutsAndBolts {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		char[] nuts = {'^','&','%','@','#','*','$','~','!'};
		char[] bolts = {'!','#','$','%','&','*','@','^','~'};
		int n = nuts.length;
	
		nutBoltMatch(nuts,bolts,n);
	}

	public static void nutBoltMatch(char[] nuts, char[] bolts, int n) {
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			hm.put(nuts[i], i);
		}
		 for (int i = 0; i < n; i++) {
		      if (hm.containsKey(bolts[i]))
		        nuts[i] = bolts[i];
		 }
		 System.out.println("matched nuts and bolts are-");
		    for (int i = 0; i < n; i++) {
		      System.out.print(nuts[i] + " ");
		    }
		    System.out.println();
		    for (int i = 0; i < n; i++) {
		      System.out.print(bolts[i] + " ");
		    }
	}

}
