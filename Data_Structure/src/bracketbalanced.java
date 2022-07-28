import java.util.Scanner;
import java.util.Stack;

public class bracketbalanced {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n=sc.nextInt();
		
		
//		while (n-- != 0) {
			String s = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			
			boolean isBalanced = true;

			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				
				if(ch=='(' || ch=='{' || ch=='[') {
					stack.push(ch);
					continue;
				}
				if(stack.isEmpty()) {
					isBalanced=false;
				}
				
			    if(ch==')') {
			    	if(stack.peek()=='(') {
			    		stack.pop();
			    	}
			    	else {
			    		isBalanced=false;
			    	}
			    }
			    if(ch == '}') {
			    	if(stack.peek()=='{') {
			    		stack.pop();
			    	}
			    	else {
			    		isBalanced=false;
			    	}
			    }
			    if(ch == ']') {
			    	if(stack.peek()=='[') {
			    		stack.pop();
			    	}
			    	else {
			    		isBalanced=false;
			    	}
			    }
		    }
			if(!stack.isEmpty()) {
				isBalanced=false;
			}
			if(isBalanced) {
				System.out.println("Balanced");
			}
			else {
				System.out.println("Not Balanced");
			}
//		}		
		sc.close();
	}

}
