package javaCore;

public class ArraysPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the largest number form the matrix
		
		int a[][]= {{6,9,0},{23,12,30},{5,9,4}};
		
		int max=a[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
			
		}
		System.out.println(max);
	}

}
