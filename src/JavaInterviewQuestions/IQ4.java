package JavaInterviewQuestions;

public class IQ4 {

	public static void main(String[] args) {
		
		
		//4. Find out how many alpha characters are present in a String? Find the number of
		//words in a string?
		//How many letters in a String? No numbers, no special characters.
		
		String word="jb,nm,n<Dgchngh212576yhbncbzhck";
		String word1=word.replaceAll("[^a-zA-Z]", "");
		System.out.println(word1);
		System.out.println(word1.length());
		System.out.println();
		
		
		String sentence="Yildirim is here today and why";
		String[] ses=sentence.split(" ");
		System.out.println(ses.length);
		System.out.println(sentence.length());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
