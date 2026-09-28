package Stream;

import java.util.stream.*;
import java.util.*;

public class Filter {

	public static void main(String[] args) {
		//filter will take perdicate as a parameter
		
		List<Integer> numberList=Arrays.asList(5,10,15,20,25);
		
		//Print only even numbers using another list
		List<Integer> evenNumbers=new ArrayList<>();
		evenNumbers=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//Print only even numbers directly
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n+" "));
		
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//Print name which length is more than 4 and less than 8
		List<String> name=Arrays.asList("Elango","Ram","Siva","qwertyui","manoj");
		List<String> filteredName=new ArrayList<>();
		
		filteredName=name.stream().filter(n->n.length()>4 && n.length()<8).collect(Collectors.toList());
		System.out.println(filteredName);
		
		//Remove null values
		List<String> words=Arrays.asList("Elango",null,"Siva",null,"manoj");
		List<String> result=words.stream().filter(n->n!=null).collect(Collectors.toList());
		System.out.println(result);
	}

}
