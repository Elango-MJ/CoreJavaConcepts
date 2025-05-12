package interviewquestions;

public class Reverese_scentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="API Automation testing";
		String[] arr=str.split(" ");
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			String a=arr[left];
			arr[left]=arr[right];
			arr[right]=a;
			left++;
			right--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
