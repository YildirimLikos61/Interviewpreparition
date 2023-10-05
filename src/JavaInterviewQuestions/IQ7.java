package JavaInterviewQuestions;

public class IQ7 {

	public static void main(String[] args) {
		
		
		
		//7. Write a java program to find the second largest number in the array? Maximum
		//and minimum number in the array?
		//Do it in one iteration.
		
		int[] num= {12,11,8,12,13,54,14};
		
		int max=num[0];
		int min=num[0];
		int secondMax=num[0];
		
		for(int i=0; i<num.length; i++) 
		{
			if(num[i]>max) 
			{
				secondMax=max;
				max=num[i];
			}else if(num[i]>secondMax) 
			{
				secondMax=num[i];
			}if(num[i]<min) 
			{
				min=num[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(secondMax);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
