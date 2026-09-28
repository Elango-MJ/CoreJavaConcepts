package InterviewQuestions4;

public class MaxSumofSubArray {

	public static void main(String[] args) {
		// find maxsum of SubArray
		int[] arr= {-4,5,34,-8,-5,-1,5,9,4,-9,6,-8};
		int maxsum=Integer.MIN_VALUE;
		int start =0,end=0;
		for(int i=0;i<arr.length;i++) {
			int currentsum=0;
			for(int j=i;j<arr.length;j++) {
				currentsum+=arr[j];
				if(currentsum>maxsum) {
					maxsum=currentsum;
					start=i;
					end=j;
				}
			}
		
		}
		System.out.println("maxsum: "+maxsum);
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
