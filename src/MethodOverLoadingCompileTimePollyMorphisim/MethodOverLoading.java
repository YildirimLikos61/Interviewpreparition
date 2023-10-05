package MethodOverLoadingCompileTimePollyMorphisim;

public class MethodOverLoading {

	//We can over load static , private and main method
	
	//Compile time Pollymorphism Method over loading is happening within the class
	//With the same name we can over load a method with;
	//1- different parameters
	//2-different type parameters
	//3-different order of parameters
	//4-number of parameters
	
	
	
	public static void math(int a) 
	{
		if(a>0) 
		{
			System.out.println(a+" is posotive");
		}else 
		{
			System.out.println(a+" is negative");	
		}
	}
	
	public static void math(int a,int b) 
	{
		if(a>b) 
		{
			System.out.println(a+" is bigger "+b);
		}else 
		{
			System.out.println(b+" is bigger than "+a);
		}
	}
	
	
	public static void math(int a,int b,int c) 
	{
		if(a>b) 
		{
			if(a>c) 
			{
				System.out.println(a+" is biggest");
			}else 
			{
				System.out.println(c+" is the biggest");
			}
		}else if(c>a) 
		{
			if(c>b) 
			{
				System.out.println(c+" is the biggest");
			}else 
			{
				System.out.println(b+" is the biggest");
			}
		}else 
		{
			System.out.println("numbers are equals");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		math(10,10,10);
		
		
		
		
	}
	
}
