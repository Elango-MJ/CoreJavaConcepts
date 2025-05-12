package interviewQuestion2;

public class SumOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=400;
		
		int sum=0;
		while(a>0) {
			int rem=a%10;
			a=a/10;
			sum=sum+rem;
			
		}
		System.out.println(sum);

	}

}
