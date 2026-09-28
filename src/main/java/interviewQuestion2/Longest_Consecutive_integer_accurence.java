package interviewQuestion2;

public class Longest_Consecutive_integer_accurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,9,3,4,5,6,7,8,10,56,67,5,6,7,8,9,46,1,4};
		
		int count=1,max=0;
		
		for(int i=1;i<a.length;i++) {
			if(a[i-1]+1==a[i]) {
				count++;
			}else {
				count=1;
			}
			max=Math.max(max, count);
		}
		System.out.println(max);

	}

}
