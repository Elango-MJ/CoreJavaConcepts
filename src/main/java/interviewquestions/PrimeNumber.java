package interviewquestions;

public class PrimeNumber {
	
	public static boolean prime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=79;
		if(prime(num)) {
			System.out.println(num+":is a prime number");
		}else {
			System.out.println(num+":is not a prime number");
		}
		

	}

}
