package InterviewQuestions3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputarr= {4,7,9,4,2,8,7,6};
		//bruteForceMethod(inputarr);
		//sortingMethod(inputarr);
		//hashSetMethod(inputarr);
		hashMapMethod(inputarr);
	}
	
	//Using Brute force method --> time complexity = o(n^2)
	private static void bruteForceMethod(int[] arr) {
		boolean check=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element found : "+arr[i]);
					check=true;
				}
			}
		}
		if(!check)
		System.out.println("Duplicate element not found");
	}
	
	//Using sorting method --> time complexity = o(n)+o(nlogn)
	private static void sortingMethod(int[] arr) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println("Duplicate element found : "+arr[i]);
			}
		}
		
	}
	
	//Using HashSet Method --> time complexity = o(n)
	private static void hashSetMethod(int[] arr) {
		Set<Integer> hs = new HashSet<Integer>();
		for(int x:arr) {
			if(!hs.add(x)) {  // add() method returns booleans return type
				System.out.println("Duplicate element found : "+x);
			}
		}
	}
	
	//Using HashMap method --> time complexity = o(n)
	private static void hashMapMethod(int[] arr) {
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int x:arr) {
			if(hm.containsKey(x)) {
				hm.put(x, hm.get(x)+1);
			}else {
				hm.put(x, 1);
			}
		}
		for(int y:hm.keySet()) {
			if(hm.get(y)>1) {
				System.out.println("Duplicate element found : "+y);
			}
		}
	}

}
