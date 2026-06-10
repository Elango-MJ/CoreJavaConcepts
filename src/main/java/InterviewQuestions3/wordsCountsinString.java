package InterviewQuestions3;

import java.util.HashMap;

public class wordsCountsinString {

	public static void main(String[] args) {
		// Count the number of repeating words in a given string
		
		String str="I am learing learing java java java java programming XX";
		String[] s=str.split(" ");
		
		HashMap<String,Integer> hs = new HashMap<>();
		 for(String a:s) {
			 if(hs.containsKey(a)) {
				 hs.put(a, hs.get(a)+1);
			 }
			 else {
				 hs.put(a, 1);
			 }
		 }
		 
		 for(String x:hs.keySet()) {
		 System.out.println("The count of word : "+x+"="+hs.get(x));
		 }
	
                 
	}

}
