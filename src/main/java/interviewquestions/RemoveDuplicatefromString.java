package interviewquestions;

public class RemoveDuplicatefromString {

	public static void main(String[] args) {
        
    	String str = "programming";
        StringBuilder result = new StringBuilder();
        
        // Loop through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // Check if the current character is already in the result string
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If not a duplicate, add it to the result
            if (isDuplicate==false) {
                result.append(currentChar);
            }
        }
        
        System.out.println(result.toString());
    }
}
