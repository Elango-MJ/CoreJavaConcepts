package interviewquestions;

public class ReversArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[]= {'a','b','c','d','e','f'};
		
		int left=0;
		int right =a.length-1;
		while(left<right) {
			char c=a[left];
			a[left]=a[right];
			a[right]=c;
			left++;
			right--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}

	}

}
