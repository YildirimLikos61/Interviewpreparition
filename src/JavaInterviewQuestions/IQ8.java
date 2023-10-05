package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IQ8 {

	public static void main(String[] args) {
		
		//8. How can you remove all duplicates from ArrayList?
		//You can create a new ArrayList and add the values one by one, checking if the
		//object exists or not. You can also use a Set.
		
		
		List<String> asia=new ArrayList<String>();
		asia.add("Tokyo");
		asia.add("Turkey");
		asia.add("Kosova");
		asia.add("China");
		asia.add("Tokyo");
		System.out.println(asia.size());
		
		Set<String> set=new HashSet<String>(asia);
		System.out.println(set);
		
		List<String> asia2=new ArrayList<String>();
		
		for(int i=0; i<asia.size(); i++) 
		{
			String k=asia.get(i);
			if(!asia2.contains(k)) 
			{
				asia2.add(k);
			}
		}
		System.out.println(asia);
		System.out.println(asia2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
