package InterviewQuestions3;

public class largestAndSmallestElementinArray {

	public static void main(String[] args) {
		// Find the largest and smallest element in an array
		
		int[] arr= {38,47,3,-9,-45,65,1,489,-230,2};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
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
