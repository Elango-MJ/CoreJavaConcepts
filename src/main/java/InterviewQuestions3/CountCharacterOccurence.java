package InterviewQuestions3;

import java.util.HashMap;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		// Count character occurrence in a given string
		
		String str = "Java is object oriented language";
		char[] arr =str.toCharArray();
		HashMap<Character, Integer> hs=new HashMap<>();
		for(char chr:arr) {
			if(hs.containsKey(chr))
				hs.put(chr, hs.get(chr)+1);
			else
				hs.put(chr, 1);
		}
		for(char x:hs.keySet()) {
			System.out.println("Count of characters : "+x+" = "+hs.get(x));
		}
		
		//To get the character occurrence of specific letter
		int result = str.length()-str.replaceAll("o", "").length();
		System.out.println(result);

	}

}
