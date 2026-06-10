package InterviewQuestions3;

public class reverseWordsInString {

	public static void main(String[] args) {
		// Reverse words in a string
		// input = I am learning java
		// output = java learning am I
		
		String str ="I am learning java";
		String[] arr= str.split("\\s");
		String result="";
		
		for(int i=arr.length-1;i>=0;i--) {
			result+=arr[i]+" ";
		}
		System.out.println(result);
	}

}
