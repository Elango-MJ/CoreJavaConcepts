package interviewQuestion2;

public class ConvertNumricToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
		
		String s="a2b3c4";
		
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}else {
				int a=Character.getNumericValue(s.charAt(i));
				for(int j=1;j<a;j++) {
					System.out.print(s.charAt(i-1));
					
				}
			}
		}

	}

}
