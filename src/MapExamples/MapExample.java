package MapExamples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		//Map is collection of entry object 
		//We can store key value pairs in Map
		//Key has to be unique
		//It is one direction key to value
		//If we have the key we can reach the value
		//We can put all the keys in a keySet
		//We can not iterate it by itself
		
		
		
		
		
        //  Create a map of car models that you have in your garage and for each model the number of car you have.
		//	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
		//	For example:
		//	"BMW" -> 2
		//	"Mercedes" -> 3
		//	"Audi" -> 3
		//	"Ferrari" -> 1
		
		
		
		Map<String,Integer> map=new LinkedHashMap<>();
		
		map.put("BMW", 2);
		map.put("Mercedes", 3);
		map.put("Audi", 3);
		
		System.out.println("WITH KEYSET");
		for(String s:map.keySet()) 
		{
			Integer value=map.get(s);
	        System.out.println(s+" "+value);
		}
		
		System.out.println("WITH ENTRYSET");
		
		Set<Entry<String,Integer>> entry=map.entrySet();
		
		for(Entry<String,Integer> ent:entry) 
		{
			String key=ent.getKey();
			Integer value=ent.getValue();
			System.out.println(key+" "+value);
			
		}
		
		System.out.println("WITH ITERATOR");
		
		Iterator<Entry<String,Integer>> it=entry.iterator();
		
		while(it.hasNext()) 
		{
			Entry<String,Integer> next=it.next();
			System.out.println(next.getKey()+" "+next.getValue());
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
