package InterviewQuestions3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateWordsinScentence {

	public static void main(String[] args) {
		// Remove duplicate words in a given sentence
		
		String str="I am am learning java java";
		String[] arr =str.split("\\s");
		String result="";
		 Set<String> hs= new HashSet<String>();
		 for(String x:arr) {
			 if(hs.add(x)) {
				 result += x+" ";
			 }
		 }
		 System.out.println(result);
		

	}

}
