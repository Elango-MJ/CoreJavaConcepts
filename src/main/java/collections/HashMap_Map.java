package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(0, "Hello");
		hs.put(1, "Morning");
		hs.put(2, "evening");
		hs.put(3, "Night");
		System.out.println(hs.size());
		
		Set s=hs.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}

	}

}
