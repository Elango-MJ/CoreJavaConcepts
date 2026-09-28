package InterviewQuestions4;

import java.util.Arrays;

public class SumofTwoNumbers {

	public static void main(String[] args) {
		// find the two numbers to get the expected sum output(n1+n2=9);
		
		int[] arr= {6,4,2,8,5};
		int n=9;
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int sum=0;
		while(left<right) {
			sum=arr[left]+arr[right];
			if(sum==n) {
				System.out.print(arr[left]+" "+arr[right] );
				break;
			}else if(sum<n) {
				left++;
			}else {
				right--;
			}
		}

	}

}
