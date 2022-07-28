import java.util.ArrayList;
import java.util.Iterator;

public class Example {
	public static void main(String[] args) {
	ArrayList<Integer> noslist = new ArrayList<>();
	
	noslist.add(32);
	noslist.add(43);
	noslist.add(35);
	noslist.add(778);
	noslist.add(345);
	
	Iterator newlist = noslist.iterator();
	while(newlist.hasNext()) {
		System.out.println(newlist.next());
	}
	ArrayList<String> slist = new ArrayList<>();
	slist.add("satyajit");
	slist.add("sipun");
	slist.add("programmer");
	slist.add("codder");
	Iterator<String> iterator = slist.iterator();
	while( iterator.hasNext()) {
		if(iterator.next().endsWith("r")) {
			iterator.remove();
		}
	}
	System.out.println(slist);
	}
}