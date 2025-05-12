package interviewQuestion2;

import java.util.ArrayList;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,7,5,2,8,7,9};
		
		ArrayList<Integer> l=new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			
			boolean duplicate=false;
			if(l.contains(a[i])) {
				duplicate=true;
			}
			else if(duplicate==false) {
				l.add(a[i]);
			}
		}
		
		System.out.println(l);
		
		//convert to list to array
		Integer[] b=new Integer[l.size()];
		l.toArray(b);
		
		int result[]=new int[b.length];
		for(int j=0;j<b.length;j++) {
			result[j]=b[j];
		}

	}

}
