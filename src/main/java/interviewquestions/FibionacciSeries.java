package interviewquestions;

import java.util.Scanner;

public class FibionacciSeries {

	public static void main(String[] args) {
		
		//user input
		int serieslength;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbet: ");
		serieslength=sc.nextInt();
		
		int[] a=new int[serieslength];
		
		a[0]=0;
		a[1]=1;
		for(int i=2;i<serieslength;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		

	}

}
