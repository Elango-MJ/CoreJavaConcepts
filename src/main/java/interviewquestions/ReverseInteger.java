package interviewquestions;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=4721;
		int sum=0;
		while(input>0) {
			int arg=input%10;
			sum=sum*10+arg;
			input/=10;
		}
		System.out.println(sum);

	}

}
