package interviewQuestion2;

public class PerfectTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			// Print spaces first
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			// Print stars in each row
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
