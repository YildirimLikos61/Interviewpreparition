package JavaInterviewQuestions;

public class IQ2 {

	public static void main(String[] args) {
		

	     //Write a java program to check whether a given number is prime or not?
		
		//Check if a number is divisible by any of smaller numbers. Use the mod operator.
		
		int num=11;
		
		boolean prime=true;
		if(num==1) 
		{
			prime=false;
		}else 
		{
			for(int i=2; i<num; i++) 
			{
				if(num%i==0) 
				{
					prime=false;
				}
			}
		}
		
		if(prime) 
		{
			System.out.println(num+" is prime");
		}else
		{
		System.out.println(num+" is not prime");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
