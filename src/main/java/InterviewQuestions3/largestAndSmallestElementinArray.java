package InterviewQuestions3;

public class largestAndSmallestElementinArray {

	public static void main(String[] args) {
		// Find the largest and smallest element in an array
		
		int[] arr= {489,-230,47,3,-9,789,-45,65,1,2};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("largest number : "+max);
		System.out.println("smallest number : "+min);
	}

}
