package collections;

import java.util.ArrayList;

public class ArrayList_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Java");
		a.add("Test");
		System.out.println(a);
		a.add(1, "Automation");
		System.out.println(a);
		a.set(1, "Replaced"); // used for replace the value
		System.out.println(a);
		/*a.remove(0); //remove by index
		a.remove("Test"); // remove by value
		System.out.println(a); */
		System.out.println(a.get(2));
		System.out.println(a.contains("Java"));
		System.out.println(a.get(2));
		System.out.println(a.indexOf("Test"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		

	}

}
