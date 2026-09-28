package InterviewQuestions3;

public class reverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input = Ela123ngo
		//output = ogn123alE
		String input ="6Ela123ngo";
		char arr[]=input.toCharArray();
		int left =0, right=arr.length-1;
		while(left<right) {
			if(!Character.isLetter(arr[left])) {
				left++;
			}else if(!Character.isLetter(arr[right])) {
				right--;
			}else {
				char temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println(String.valueOf(arr));
	

	}

}
