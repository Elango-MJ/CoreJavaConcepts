package InterviewQuestions3;

public class reverseletters {

	public static void main(String[] args) {
		//input = Ela123ngo
		//output = ale123ogn
        String input = "Ela123ngo";
        char arr[]=input.toCharArray();
        StringBuilder letters=new StringBuilder();
        StringBuilder result=new StringBuilder();
        
        for(char c:arr) {
        	if(Character.isLetter(c)) {
        		letters.append(c);
        	}else {
        		result.append(letters.reverse());
        		letters.setLength(0);
        		result.append(c);
        	}
        }
        result.append(letters.reverse());
        System.out.println(result.toString().toLowerCase());
    }

}
