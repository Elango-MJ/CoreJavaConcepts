package interviewQuestion2;

public class Longest_Consecutive_integer_accurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,3,4,5,6,7,8,10,56,67,5,6,7,8,9,46,1,4};
		
		int count=0,max=0;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+1==a[i+1]) {
				count++;
			}else {
				count=0;
			}
			max=Math.max(max, count+1);
		}
		System.out.println(max);

	}

}
