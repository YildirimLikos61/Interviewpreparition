package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		//1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
		//	without a temporary variable?
		//	int a = 5;
		//	int b = 10;
		//	At the end, the value of b will be 5 and the value of a will be 10.
		//	You can add them together and remove them from each other.
						
		int a=5;
		int b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		
		String str="Yildirim";
		String str2="Likos";
		
		str=str+str2;
		str2=str.substring(0,str.length()-str2.length());
		str=str.substring(str2.length());
		System.out.println(str);
		System.out.println(str2);
		
	
		//Write a java program to check whether a given number is prime or not?
		
		//Check if a number is divisible by any of smaller numbers. Use the mod operator.
		
		int num =19;
		
		boolean isprime=true;
		
		if(num==1) 
		{
			isprime=false;
		}else 
		{
			for(int i=2; i<num; i++) 
			{
				if(num%i==0) 
				{
					isprime=false;
				}
			}
		}
		
		if(isprime) 
		{
			System.out.println(num+" is prime");
		}else 
		{
			System.out.println(num+" is not prime");
		}
		
		System.out.println();

		//3. Write a Java Program to print the first 10 numbers of Fibonacci series.
		//Fibonacci series: The next number is the sum of two previous numbers
		//You have to print -> 1,1,2,3,5,8,13,21,34,55...
		
		int[] number= new int[10];
		
		
		number[0]=1;
		number[1]=1;
		
		for(int i=0; i<number.length-2; i++) 
		{
			number[i+2] =number[i]+number[i+1];
		}
		
		System.out.println(Arrays.toString(number));
		
		
		System.out.println();
		int k=1;
		int l=1;
		int next;
		
		for(int i=1; i<=10; i++) 
		{
			System.out.print(k+ " ");
			next=k+l;
			k=l;
			l=next;
			
		}
		
		System.out.println();
		//4. Find out how many alpha characters are present in a String? Find the number of
		//words in a string?
		//How many letters in a String? No numbers, no special characters.
		
		String kel="jkABCKJgbkjbn1n32kn1l.mn,.,ljoih?";
		String kel1=kel.replaceAll("[^a-zA-Z]", "");
		System.out.println(kel1);
		
		System.out.println(kel1.length());
		System.out.println();
		
		String word="Yildirim is here";
		String[] word1=word.split(" ");
		System.out.println(word1.length);
		System.out.println();
		
		for(int i=word1.length-1; i>=0; i--) 
		{
			System.out.print(word1[i]+ " ");
		}
		
		
		//5. Write a java program to reverse a String? Reverse a string word by word?
		//1. Neotech -> hcetoeN
		//2. I love Java very much -> much very Java love I
		
		
		System.out.println();
		String neo="Neotech";
		
		for(int i=neo.length()-1; i>=0; i--) 
		{
			System.out.print(neo.charAt(i));
		}
		System.out.println();
		
		char[] a1=neo.toCharArray();
		for(int i=a1.length-1; i>=0; i--)
		{
			System.out.print(a1[i]);
		}
		System.out.println();
		
		StringBuffer sd=new StringBuffer(neo);
		System.out.print(sd.reverse());
		
		System.out.println();
		//6. Write a Java Program to find whether a String is palindrome or not?
		//Palindrome a word, phrase, or sequence that reads the same backward as forward.
		//radar yes; baba no; kayak yes; madam yes;
		
		String her="kayak";
		StringBuffer sx=new StringBuffer(her);
		String her1=sx.reverse().toString();
		if(her.equals(her1)) 
		{
			System.out.println(her+" is palindrome");
		}else 
		{
			System.out.println(her +" is not palindrome");
		}
		
		
		

		//7. Write a java program to find the second largest number in the array? Maximum
		//and minimum number in the array?
		//Do it in one iteration.
		
		System.out.println();
		int[] numbers= {10,15,12,45,78,99,98};
		int max=numbers[0];
		int min=numbers[0];
		int secondmax=numbers[0];
		
		for(int i=0; i<numbers.length; i++) 
		{
			if(numbers[i]>max) 
			{
				secondmax=max;
				max=numbers[i];
			}else if(numbers[i]>secondmax) 
			{
				secondmax=numbers[i];
			}if(numbers[i]<min) 
			{
				min=numbers[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(secondmax);
		
		
		//8. How can you remove all duplicates from ArrayList?
		//You can create a new ArrayList and add the values one by one, checking if the
		//object exists or not. You can also use a Set.
		
		System.out.println();
		
		List<String> asia=new ArrayList<>();
		
		asia.add("Turkey");
		asia.add("Japan");
		asia.add("China");
		asia.add("Japan");
		
		Set<String> set=new HashSet<>(asia);
		System.out.println(set);
		
		
		List<String> asia2=new ArrayList<>();
		
		for(int i=0; i<asia.size(); i++) 
		{
			String index=asia.get(i);
			if(!asia2.contains(index)) 
			{
				asia2.add(index);
			}
			
		}
		
		System.out.println(asia);
		System.out.println(asia2);
		
		
		
		
		
		
	}
	
		
	
}
