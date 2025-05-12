package interviewquestions;

public class Palindrome {
	
	public static void abc(String str) {
		int i=0;
	    int j=str.length()-1;
	    boolean c=true;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				//C++;
				
			}else {
				System.out.println("not a palindrome");
				c=false;
			    break;
			}
			
			//System.out.println("palindrome");
		}
		if(c) {
			
		System.out.println("palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str="dogod";
//		String reverseStr="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			reverseStr=reverseStr+str.charAt(i);
//		}
//		
//		if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
//			System.out.println(str+" is a palindrome");
//		}else {
//			System.out.println(str+" is not a palindrome");
//		}
//		//remove whitespace
//		String a="  jhf fijf dun kd  ";
//		System.out.println(a.replace(" ", ""));
		abc("dogdjrjhod");
		
		
				

	}

}
