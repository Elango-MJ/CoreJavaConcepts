package InterviewQuestions3;

public class reverseEveryWordInString {

	public static void main(String[] args) {
		// Reverse every individual words in a given string
		//input = How are you
		//output = woh era uoy
		
		String str="How are you";
		String[] arr = str.split("\\s"); // "\\s" --> considered as space
		String output ="";
		for(String word:arr) {
			for(int i=word.length()-1;i>=0;i--) {
				output+=word.charAt(i);
			}
			output+=" ";
		}
		System.out.println(output.toLowerCase());
	

	}

}
