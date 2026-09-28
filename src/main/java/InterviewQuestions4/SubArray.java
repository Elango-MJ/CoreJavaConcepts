package InterviewQuestions4;

public class SubArray {

	public static void main(String[] args) {
		// find the max sum of subArray for length K(sliding window method)
		 int[] arr= {2,6,-7,5,-1,8,3,-8,5};
		 int k=4;
		 int maxsum=0;
		  for(int i=0;i<k;i++) {
			  maxsum+=arr[i];
		  }
		 int windowSum=maxsum;
		 for(int i=k;i<arr.length;i++) {
			 windowSum+=arr[i]-arr[i-k];
			 maxsum=Math.max(windowSum, maxsum);
		 }
		 System.out.println(maxsum);

	}

}
