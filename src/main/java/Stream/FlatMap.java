package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		// FlatMap used to handle complex collections
		List<Integer> list1=Arrays.asList(1,2,3);
		List<Integer> list2=Arrays.asList(4,5,6);
		List<Integer> list3=Arrays.asList(7,8,9);
		List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);
		List<Integer>result=finalList.stream().flatMap(n->n.stream()).map(n->n+10).collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
