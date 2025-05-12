package javaCore;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		System.out.println("");
		int k = 0;
		for(int x=1;x<=3;x++) {
			for(int y=1;y<=x;y++) {
				k=k+3;
				System.out.print(k);
				System.out.print("\t");
			}
			System.out.println("");
		}

	}

}
