package JavaInterviewQuestions;

import java.util.Arrays;

public class IQ3 {

	public static void main(String[] args) {
		

		//3. Write a Java Program to print the first 10 numbers of Fibonacci series.
		//Fibonacci series: The next number is the sum of two previous numbers
		//You have to print -> 1,1,2,3,5,8,13,21,34,55...
		
		
		int[] num=new int[10];
		
		num[0]=1;
		num[1]=1;
		
		for(int i=0; i<num.length-2; i++) 
		{
			num[i+2]=num[i+1]+num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println();
		for(int i=0; i<num.length; i++) 
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		//Second way
		int a=1;
		int b=1;
		int next;
		
		for(int i=1; i<=10; i++) 
		{
			System.out.print(a+" ");
			next=a+b;
			a=b;
			b=next;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
