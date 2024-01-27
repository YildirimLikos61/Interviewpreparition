package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {

		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings
		// without a temporary variable?
		// int a = 5;
		// int b = 10;
		// At the end, the value of b will be 5 and the value of a will be 10.
		// You can add them together and remove them from each other.

		
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
		
		
		
		
		
		// Write a java program to check whether a given number is prime or not?
		// Check if a number is divisible by any of smaller numbers. Use the mod
		// operator.

		Boolean isprime=true;
		
		int num=18;
		
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
		
		
		
		
		
		
		// 3. Write a Java Program to print the first 10 numbers of Fibonacci series.
		// Fibonacci series: The next number is the sum of two previous numbers
		// You have to print -> 1,1,2,3,5,8,13,21,34,55...

		
		int[] number=new int[10];
		number[0]=1;
		number[1]=1;
		
		
		for(int i=0; i<number.length-2; i++) 
		{
			number[i+2]=number[i]+number[i+1];
		}
		
		
		System.out.println(Arrays.toString(number));
		
		
		int k=1;
		int l=1;
		int next;
		
		for(int i=1; i<=10; i++)
		{
			System.out.print(k+" ");
			next =k+l;
			k=l;
			l=next;
			
		}
		
		System.out.println();
		
		
		// 4. Find out how many alpha characters are present in a String? Find the
		// number of
		// words in a string?
		// How many letters in a String? No numbers, no special characters.

		
		String word=".,.,n,211n,32b1n3bj1bn3v1b312u3y2i";
		String word1=word.replaceAll("[^a-zA-Z]","");
		System.out.println(word1);
		System.out.println(word1.length());
		
		String k1="Yildirim Likos here today";
		String[] l1=k1.split(" ");
		System.out.println(l1.length);
		
		System.out.println();
		// 5. Write a java program to reverse a String? Reverse a string word by word?
		// 1. Neotech -> hcetoeN
		// 2. I love Java very much -> much very Java love I

		String h="Neotech";
		for(int i=h.length()-1; i>=0; i--) 
		{
			System.out.print(h.charAt(i));
		}
		System.out.println();
		
		StringBuffer sb=new StringBuffer(h);
		System.out.println(sb.reverse());
		
		System.out.println();
		
		char[] mum=h.toCharArray();
		for(int i=mum.length-1; i>=0; i--) 
		{
			System.out.print(mum[i]);
		}
		System.out.println();
		String love="I love Java very much";
		String[] love1=love.split(" ");
		System.out.println(love1.length);
		
		for(int i=love1.length-1; i>=0; i--)
		{
			System.out.print(love1[i]+" ");
		}
		
		
		
		
		// 6. Write a Java Program to find whether a String is palindrome or not?
		// Palindrome a word, phrase, or sequence that reads the same backward as
		// forward.
		// radar yes; baba no; kayak yes; madam yes;

		
		System.out.println();
		String kel="kayak";
		StringBuffer kh=new StringBuffer(kel);
		String kel1=kh.reverse().toString();
		
		if(kel.equals(kel1))
		{
			System.out.println(kel+" is palindrome");
		}else 
		{
			System.out.println(kel+" is not pa;indrome");
		}
		
		
		
		
		// 7. Write a java program to find the second largest number in the array?
		// Maximum
		// and minimum number in the array?
		// Do it in one iteration.

		System.out.println();
		
		int[] numbers= {100,45,78,789,152,485};
		
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
		
		
		
		
		
		// 8. How can you remove all duplicates from ArrayList?
		// You can create a new ArrayList and add the values one by one, checking if the
		// object exists or not. You can also use a Set.

		
		
		List<String> asia=new ArrayList<>();
		asia.add("Turkey");
		asia.add("Japon");
		asia.add("China");
		asia.add("Japon");
		
		Set<String> set=new HashSet<>(asia);
		System.out.println(set);
		
		System.out.println();
		List<String> asia2=new ArrayList<>();
		
		for(int i=0; i<asia.size(); i++) 
		{
			String text=asia.get(i);
			
			if(!asia2.contains(text)) 
			{
				asia2.add(text);
			}
		}
		
		
		System.out.println(asia2);
		
		
		
		
		
		

		
		
		
	}

}





