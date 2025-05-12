package interviewquestions;



public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =153;
		
		int orginalNumber=input;
		int length=String.valueOf(input).length();
		double sum=0;
		while(input !=0) {
			int digit=input % 10;
			sum=sum+Math.pow(digit,length);
			input=input/10;
		}
		if(sum==orginalNumber) {
			System.out.println(orginalNumber+": is a Amstrong number");
		}else {
			System.out.println(orginalNumber+": is not a Amstrong number");
		}
	}

}
