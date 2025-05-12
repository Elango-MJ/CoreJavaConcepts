package interviewQuestion2;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,5,6,7,8,9,10};
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
		
			sum1+=a[i];
		}
		int sum2=0;
		for(int i=1;i<=a.length+1;i++) {
		
			sum2+=i;
		}
		
		System.out.println("Missing number: "+(sum2-sum1));

	}

}
