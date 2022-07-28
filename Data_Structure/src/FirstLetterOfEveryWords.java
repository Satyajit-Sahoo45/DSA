import java.util.Scanner;

public class FirstLetterOfEveryWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char c[] = S.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i] != ' ' && (i==0 || c[i-1] == ' ')) {
				System.out.print(c[i]);
			}
		}

	}

}
