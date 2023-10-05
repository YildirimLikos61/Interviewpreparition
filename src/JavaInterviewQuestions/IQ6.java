package JavaInterviewQuestions;

public class IQ6 {

	public static void main(String[] args) {
		
		//6. Write a Java Program to find whether a String is palindrome or not?
		//Palindrome a word, phrase, or sequence that reads the same backward as forward.
		//radar yes; baba no; kayak yes; madam yes;
		
		
		String word="Kayak";
		
		StringBuffer sd=new StringBuffer(word);
		String word1=sd.reverse().toString().toLowerCase();
		System.out.println(word1);
		if(word.toLowerCase().equals(word1)) 
		{
			System.out.println(word+" is palindrome");
		}else 
		{
			System.out.println(word+" is not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
