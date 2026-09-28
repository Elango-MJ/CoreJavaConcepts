package InterviewQuestions4;

public class ConverChartoNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input=aaabbcddef
		//output=a3b2c1d2e1f1
	
		 String str="aaabbcddeff";
		    int count=1;
		    StringBuilder sb=new StringBuilder();
		   for(int i=1;i<=str.length();i++){
		       if(i < str.length() && str.charAt(i)==str.charAt(i-1)){
		           count++;
		       }else{
		         sb.append(str.charAt(i-1)).append(count);
		          //System.out.print(str.charAt(i-1));
		          //System.out.print(count+1);
		           count=1;
		   }
		}
		System.out.println(sb.toString());

	}

}
