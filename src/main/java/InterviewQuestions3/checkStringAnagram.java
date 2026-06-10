package InterviewQuestions3;

import java.util.Arrays;

public class checkStringAnagram {

	public static void main(String[] args) {
		// Check the given two string are ANAGRAM
		
		String str1="Stop";
		String str2="Tops";
		
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
			System.out.println("Given two string are ANAGRAM");
		else
			System.out.println("Given two string are not an ANAGRAM");

	}

}
