package interviewquestions;

public class CountOfCapitalWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="CountOfCapitalWords";
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);

	}

}
