package practiceQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="swashd";
		char[] c=s.toCharArray();
		
		LinkedHashMap<Character,Integer> hs=new LinkedHashMap<>();
		
		for(char value:c) {
			if(hs.containsKey(value)) {
				hs.put(value, hs.get(value)+1);
			}else {
				hs.put(value,1);
			}
		}
		
		System.out.println(hs);
		
		boolean check=false;
		
		for(Map.Entry<Character,Integer> entry:hs.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				check =true;
				break;
			}
		}
		if(!check) {
			System.out.println("none");
		}
		
		int max=0;
		
		for(Map.Entry<Character,Integer> entry1:hs.entrySet()) {
			if(entry1.getValue()>max) {
				max=entry1.getValue();
			}	
		}
		int count=0;
		for(Map.Entry<Character,Integer> entry2:hs.entrySet()) {
			if(entry2.getValue()==max) {
				count++;
				
			}	
		}
		
		if(count>1) {
			System.out.println(c[0]);
		}else {
			for(Map.Entry<Character,Integer> entry3:hs.entrySet()) {
				if(entry3.getValue()==max) {
					System.out.println(entry3.getKey());
				}
			}
		}

	}

}
