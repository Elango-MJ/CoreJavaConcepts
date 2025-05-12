package interviewquestions;

public class GreatestofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {13,89,34};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
