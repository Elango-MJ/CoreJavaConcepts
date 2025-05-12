package demo;

public class hjdj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="My name is elango";
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<str.length();i++){
	            char c=str.charAt(i);
	            boolean isDuplicate=false;
	            for(int j=0;j<sb.length();j++){
	                if(sb.charAt(j)==c){
	                    isDuplicate=true;
	                    break;
	                }
	            }
	            if(isDuplicate==false){
	                sb.append(c);
	            }
	        }
	        System.out.println(sb.toString());
	        
	        String s="hgg"+14+"55";
	        System.out.println(s);
	        
	}

}
