import java.util.Scanner;

public class MaximumLength {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t =sc.nextInt();
	String[] str = new String[t];
	for(int i=0;i<=str.length;i++) {
		str[i]=sc.nextLine();
	}
	String name="";
	String name1="";
	for(int i=0;i<t;i++) {
		if(str[i].length() > str[i+1].length()) {
			name=str[i];
		}
		else {
			name1=str[i+1];
		}
	}
	if(name.length()>name1.length()) {
		System.out.println(name);
	}
	else {
		System.out.println(name1);
	}
	}

}
