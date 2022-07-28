import java.util.Scanner;
import java.util.Stack;

public class closigbracketIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
	    int p = sc.nextInt();
	    
	    System.out.print(bracketIndex(s,p));
		
	}

	public static int bracketIndex(String s, int pos) {
        if (s.charAt(pos) != '[') {
            return 0;
        }
  
        Stack<Character> st = new Stack<>();
  
        for (int i = pos; i < s.length(); i++) {
           
        	if (s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } 
            else if (s.charAt(i) == ']') {
                st.pop();
                if (st.empty()) {
                    return i;
                }
            }
    
        }
           return -1;
	}
}
