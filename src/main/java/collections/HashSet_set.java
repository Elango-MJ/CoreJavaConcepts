package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashSet, LinkedHashSet , TreeSAet classes implements Set interface
//		Set can not allow duplicates.
//		There is no guarantee elements stored in sequence
		
		HashSet<String> s=new HashSet<>();
		s.add("India");
		s.add("UK");
		s.add("US");
		s.add("UK");
		System.out.println(s);
		
		//s.remove("US");
		System.out.println(s);
		System.out.println(s.size());
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
