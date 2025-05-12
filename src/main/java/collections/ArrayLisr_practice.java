package collections;

import java.util.ArrayList;

public class ArrayLisr_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<>();
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		a.add("apple");
		
		System.out.println(a);
	
		for(String fruit:a) {
			if(fruit.equals("apple")) {
				a.remove(fruit);
				break;
				
			}
			
		}
		System.out.println(a);
		
		if(a.contains("orange")) {
			System.out.println("Orange is found");
		}else {
			System.out.println("Orange is not found");
		}
		
		System.out.println(a.size());
		int i=0;
		for (String fru:a) {
			System.out.println(fru+" is in the "+i+"th index");
			i++;
		}
		

	}

}
