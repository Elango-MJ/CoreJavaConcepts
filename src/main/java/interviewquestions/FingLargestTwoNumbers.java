package interviewquestions;

public class FingLargestTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {230,78,89,34,45,23,10,26};
		
		int max1=0;
		int max2=0;
		for(int i=0;i<a.length;i++) {
			if(max1<a[i]) {
				max1=a[i];
			}
		}
		for(int j=0;j<a.length;j++) {
			if(max1!=a[j] && max2<a[j]) {
				max2=a[j];
				
			}
		}
		System.out.println(max1);
		System.out.println(max2);

	}

}
