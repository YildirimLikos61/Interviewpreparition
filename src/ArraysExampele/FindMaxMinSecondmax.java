package ArraysExampele;

import utils.BaseClass;

public class FindMaxMinSecondmax extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		//Find max, minimum , second max 
	
		int [] numbers= {1,100,120,89,90,99,98,101};
		
		int max=numbers[0];
		int min=numbers[0];
		int secondMax=numbers[0];
		
		for(int i=0; i<numbers.length; i++) 
		{
			if(numbers[i]>max)
			{
				secondMax=max;
				max=numbers[i];
			}else if(numbers[i]>secondMax) 
			{
				secondMax=numbers[i];
			}if(numbers[i]<min)
			{
				min=numbers[i];
			}
		}
		
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(secondMax);
		
		System.out.println();
		
		
		//With multi dimentional
		
		int[][] num= 
			{
				{1,5,7,8,9,15,14},
				{2,10,20,48,89,79}
	        };
		
		System.out.println(num.length);
		System.out.println(num[0].length);
		System.out.println();
		int max1=num[0][0];
		int min1=num[0][0];
		int secondMax1=num[0][0];
		
		
		for(int i=0; i<num.length; i++) 
		{
			for(int j=0; j<num[i].length; j++) 
			{
				if(num[i][j]>max1) 
				{
					secondMax1=max1;
					max1=num[i][j];
				}else if(num[i][j]>secondMax1)
				{
					secondMax1=num[i][j];
				}if(num[i][j]<min1) 
				{
					min1=num[i][j];
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(max1);
		System.out.println(min1);
		System.out.println(secondMax1);
		
		
		System.out.println();
		
		
		//Find longest word and shortest
		
				String[] word= {"Pencil","Wodka","Computer","Personality"};
				String longest=word[0];
				String shortest=word[0];
				for(int i=0; i<word.length; i++) 
				{
					if(word[i].length()>longest.length()) 
					{
						longest=word[i];
					}if(word[i].length()<shortest.length()) 
					{
						shortest=word[i];
					}
				
				}
				
				System.out.println();
				System.out.println(longest);
				System.out.println(shortest);
				System.out.println();
		
		
	}
}
