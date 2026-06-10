package InterviewQuestions3;

public class manipulateArray {

	public static void main(String[] args) {
		// Print first 3 character in array of words
		// input={"Sunday","Monday","Tuesday"}
		//output={"Sun","Mon","Tue"}
		
		String[] input={"Sunday","Monday","Tuesday"};
		String[] output=new String[input.length];
		for(int i=0;i<input.length;i++) {
			String str="";
			for(int j=0;j<3;j++) {
				str+=input[i].charAt(j);
			}
			output[i]=str;		
			}
		for(int i=0;i<output.length;i++) {
		System.out.print(output[i]+" ");
		}
		System.out.println("");
		
		//using substring method
		String[] output1=new String[input.length];
		for(int i=0;i<input.length;i++) {
			output1[i]=input[i].substring(0, 3);
		}
		for(String x:output1) {
			System.out.print(x+" ");
		}
		


	}

}
