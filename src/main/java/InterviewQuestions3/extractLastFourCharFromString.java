package InterviewQuestions3;

public class extractLastFourCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programming";
		String result="";
		
		for(int i=str.length()-4;i<str.length();i++){
			result +=str.charAt(i);
		}
		System.out.println(result);
		
		//using SubString method
		
		String firstfour = str.substring(0, 4); // beginIndex is inclusive, endIndex is exclusive
		System.out.println(firstfour);
		String lastfour = str.substring(str.length()-4);
		System.out.println(lastfour);

	}

}
