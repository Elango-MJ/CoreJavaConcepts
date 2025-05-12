package interviewquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javaCore2.ParentClass;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="i am uyUucsaajk";
		char[] a=s.toCharArray();
		Arrays.sort(a);
		
		HashMap<Character,Integer> hs= new HashMap<>();
		
		for(char c:a) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}else {
				hs.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> bb:hs.entrySet()) {
			System.out.print(bb.getKey()+""+bb.getValue()+" ");
		}

	}

}
