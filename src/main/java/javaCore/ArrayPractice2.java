package javaCore;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// find the smallest number from the same column get the largest number
		int a[][]= {{6,9,7},{23,12,30},{5,1,8}};
		int min=a[0][0];
		int max=0;
		int m=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					m=j;
				}
			}
			
		}
		for(int x=0;x<3;x++) {
			if(a[x][m]>max) {
				max=a[x][m];
			}
				
			}
		System.out.println(max);
	}

}
