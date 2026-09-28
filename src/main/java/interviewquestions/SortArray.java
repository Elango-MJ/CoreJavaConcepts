package interviewquestions;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {56,34,67,4,-9,22,89,5};
		
		//bobble sort
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
					
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}

	}

}
