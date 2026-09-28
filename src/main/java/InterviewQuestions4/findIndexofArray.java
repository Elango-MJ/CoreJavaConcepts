package InterviewQuestions4;

import java.util.Scanner;

public class findIndexofArray {

	public static void main(String[] args) {
		// Given an array {1,3,3,4,5,6,6,7,8,9,9,9} when user enters search element the java program should display the index number where the element is found. if the element is repeated it should display all the those indices. if not present should display element not found
		int[] arr={1,3,3,4,5,6,6,7,8,9,9,9};
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println("element found at : "+ i);
				found=true;
			}
		}
		if(!found) {
			System.out.println("element not found");
		}
	}

}
