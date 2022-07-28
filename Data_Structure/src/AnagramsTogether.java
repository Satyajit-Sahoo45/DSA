 import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class AnagramsTogether {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		String[] s = new String[n];

		for(int i=0;i<n;i++) {
			s[i] = sc.next();
		}
		
		 Anagram(s);
	}

	private static void Anagram(String[] s) {
		HashMap<String , ArrayList<String>> hm = new HashMap<>();
		
		for(String str : s) {
			String word = str;
			char[] latter = word.toCharArray();
			Arrays.sort(latter);
			String key = new String(latter);
			
			if(hm.containsKey(key)) {
				hm.get(key).add(word);
			}
			else {
				List<String> words = new ArrayList<>();
				words.add(word);
//				System.out.println("words al " + words);
				hm.put(key, (ArrayList<String>) words);
			}
		}
		for (String str : hm.keySet()) {
            List<String> values = hm.get(str);
//            if (values.size() > 1) {
                System.out.print(values);
//            }
             System.out.println();
        }
	}
}


//if (strs == null || strs.length == 0) return new ArrayList<>();
//
//Map<String, List<String>> map = new HashMap<>();
//
//for (String s : strs) {
//    char[] ca = s.toCharArray();
//    Arrays.sort(ca);
//    String keyStr = String.valueOf(ca);
//    if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
//    map.get(keyStr).add(s);
//}
//return new ArrayList<>(map.values());



//    without sorting
//    if (strs == null || strs.length == 0) return new ArrayList<>();
//    Map<String, List<String>> map = new HashMap<>();
//    for (String s : strs) {
//    char[] ca = new char[26];
//    for (char c : s.toCharArray()) ca[c - 'a']++;
//    String keyStr = String.valueOf(ca);
//    if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
//    map.get(keyStr).add(s);
//
