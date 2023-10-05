package ArraysExampele;

public class FindDuplicate {

	public static void main(String[] args) {
		 
		//Find the unique number
		
		int [] num= {1,1,2,3,4,3,4};		
		for(int i=0; i<num.length; i++) 
		{
			boolean unique=true;
			for(int j=0; j<num.length; j++)
			{
				if(i==j) 
				{
					continue;
				}if(num[i]==num[j])
				{
					unique=false;
					break;
				}
			}
			if(unique) 
			{
				System.out.print(num[i]+" ");
				break;
			}
		}
				

		//find Duplicate word
		
		String[] name= {"coffee","Pencil","Paper","mouse","coffee"};
		
		for(int i=0; i<name.length; i++) 
		{
			boolean unique=true;
			for(int j=0; j<name.length; j++) 
			{
				if(i==j) 
				{
					continue;
				}if(name[i].equals(name[j])) 
				{
					unique=false;
					break;
				}
			}
			if(unique) 
			{
				System.out.print(name[i]+" ");
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
