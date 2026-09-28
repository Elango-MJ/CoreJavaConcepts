package InterviewQuestions3;

public class getTheZeroFirst {

	public static void main(String[] args) {
		
		//output = [0 0 0 2 1 7 4 -9]
		int arr[]= {2,1,0,7,0,4,-9,0};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]==0) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		for(int x:arr) {
			System.out.print(x+ " ");
		}

	}

}
