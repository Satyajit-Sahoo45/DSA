

import java.util.Scanner;

public class LinkedListMatrtix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
//		int m =sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		Node head = construct(mat, n);
		display(head);
		
		sc.close();
	}

	private static Node construct(int[][] arr, int n) {
		
		 Node resHead, resTail;
		    
		    resHead = resTail = new Node(arr[0][0]);

		        for(int i = 0; i < n; i++)
		        {
		            Node initNode = resTail;
		            
		            for(int j = 0; j < n; j++)
		            {
		                if(j + 1 < n)
		                {
		                    Node temp = new Node(arr[i][j + 1]);
		                    
		                    resTail.right = temp;
		                }
		                else
		                {
		                    resTail.right = null;
		                }
		                if(i + 1 < n)
		                {
		                    Node temp = new Node(arr[i + 1][j]);
		                    
		                    resTail.down = temp;
		                }
		                else
		                {
		                    resTail.down = null;
		                }
		                
		                resTail = resTail.right;
		            }
		        
		           resTail = initNode.down;
		        }
		    
		           return resHead;
	}
	
	public static void display(Node head) {
		   Node Rp;
		 
	        Node Dp = head;
	 
	        while (Dp != null) {
	            Rp = Dp;
	 
	            while (Rp != null) {
	                System.out.print(Rp.data + " ");
	                Rp = Rp.right;
	            }
	            System.out.println();
	            Dp = Dp.down;
	        }
	}

}

class Node{
	Node right, down;
	int data;
	
	public Node(int data) {
		this.data = data;
		right=null;
		down=null;
	}
}
