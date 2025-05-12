package javaCore;

public class ArraysDemo {
	// A container which stores multiple data of a same data type
	
	public static void main(String[] args) {
		
		int a[][]=new int[2][3];
		a[0][0]=4;
		a[0][1]=7;
		a[0][2]=8;
		a[1][0]=3;
		a[1][1]=2;
		a[1][2]=5;
		
		int b[][]= {{4,7,8},{3,2,5}};
		
		System.out.println(a.length); // row length
		System.out.println(a[0].length); //Column length
		System.out.println("-----");
		
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
