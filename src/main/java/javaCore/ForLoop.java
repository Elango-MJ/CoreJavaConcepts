package javaCore;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(k);
				System.out.print("\t"); //tab or space
				k++;
			}
			System.out.println("");
			
		}



//Output:
//1	2	3	4	
//5	6	7	
//8	9	
//10

int a=1;
for(int x=0;x<4;x++) {
	for(int y=1;y<=1+x;y++) {
		System.out.print(a);
		System.out.print("\t"); //tab or space
		a++;
	}
	System.out.println("");
	
}
//output
//1	
//2	3	
//4	5	6	
//7	8	9	10

}
}

