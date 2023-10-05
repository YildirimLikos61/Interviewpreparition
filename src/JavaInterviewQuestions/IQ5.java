package JavaInterviewQuestions;

public class IQ5 {

	
	public static void main(String[] args) {
		
		//5. Write a java program to reverse a String? Reverse a string word by word?
		//1. Neotech -> hcetoeN
		//2. I love Java very much -> much very Java love I
		
		
		String comp="Neotech";
		
		for(int i=comp.length()-1; i>=0; i--) 
		{
			System.out.print(comp.charAt(i));
		}
		System.out.println();
		
		char[] a=comp.toCharArray();
		for(int i=a.length-1; i>=0; i--) 
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		StringBuffer sb=new StringBuffer(comp);
		System.out.println(sb.reverse());
		
		
		System.out.println();
		String day="I love Java very much";
		String[] day1=day.split(" ");
		
		
		for(int i=day1.length-1; i>=0; i--) 
		{
			System.out.print(day1[i]+" ");
		}
		System.out.println();
		
		
		
		for(int i=0; i<day1.length; i++) 
		{
			StringBuffer sc=new StringBuffer(day1[i]);
			System.out.print(sc.reverse()+" ");
		}
		System.out.println();
		
		
		
		for(int i=day1.length-1; i>=0; i--) 
		{
			StringBuffer sd=new StringBuffer(day1[i]);
			System.out.print(sd.reverse()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
