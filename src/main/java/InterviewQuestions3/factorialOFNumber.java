package InterviewQuestions3;

public class factorialOFNumber {

	public static void main(String[] args) {
		// Find the factorial of given number
		//5! = 5*4*3*2*1 =120
		
		int n=5;
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		System.out.println(result);

	}

}
