package ListExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		//List is a collection of object
		//List is s Interface which allows you to have duplicate value
		//List is one of the collection frame work
		//List extending the Collection interface and Collection interface extending the Iterable interface
		
		//It has several classes 
		//ArrayList
		//its better for storing the data and reaching the data
		//its following array internal path / index base so we can use traditional loop
		
		
		//LinkedList
		//its better for manupulating the date 
		//faster
		
		ArrayList<String> list=new ArrayList<String>();
		
		LinkedList<Integer> list1=new LinkedList<>();
		
		
		list.add("Yildirim");
		list.add("Fatma");
		list.add("Kemal");
		System.out.println(list.contains("Yildirim"));
		
		for(String s:list) 
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) 
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		
		//Set interface 
		//Set doesn't allow us to have duplicate value 
		//Only one null value we can have 
		//We can not use traditional loop 
		//There are several classes implements it
		
		//HashSet no order maintain
		//LinkedHashSet   insertion order
		//TreeSet  ancending order alphabetical order
		
		Set<String> set=new HashSet<>();
		
		set.add("Yidilrim");
		set.add("Zeleyha");
		set.add("Coffee");
		set.add("Yildirim");
		System.out.println(set);
		System.out.println();
		for(String s:set)
		{
			System.out.print(s+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
