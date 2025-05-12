package interviewQuestion2;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {34,5,67,12,90};
		
		int max1=0;
		int max2=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max1=a[i];
			}
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]>max2 && a[j]!=max1) {
				max2=a[j];
			}
		}
		
		System.out.println(max2);

	}

}
