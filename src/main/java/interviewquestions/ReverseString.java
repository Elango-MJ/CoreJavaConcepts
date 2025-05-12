package interviewquestions;

public class ReverseString {

	public static void main(String[] args) {
		String inputString="Elango dgf";
		String output ="";
		for(int i=inputString.length()-1;i>=0;i--) {
			output+=inputString.charAt(i);
		}
		System.out.println(output);
	

	}

}
