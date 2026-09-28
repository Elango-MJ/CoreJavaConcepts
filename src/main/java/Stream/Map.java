package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		// map() is used to transform the data.
		//map will take consumer as a parameter
		
		//convert the name into uppercase
		List<String> name=Arrays.asList("Elango","Ram","Siva","manoj");
		List<String> result=name.stream().map(word->word.toUpperCase()).collect(Collectors.toList());
		System.out.println(result);
		
		//find the length of the names
		List<Integer> lenght=name.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println(lenght);
		
		//multiply by 3
		List<Integer> numberList=Arrays.asList(5,10,15,20,25);
		numberList.stream().map(num->num*3).forEach(System.out::println);

	}

}
