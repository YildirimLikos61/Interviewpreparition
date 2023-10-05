package AbstractAndInterface;

public abstract class AbstractExample {

	//In abstract class we can have implemented and unimplemented method 
		//we can have constructor
		//We can not create an object of abstract class
		//We can extend only one class 
		//Abstraction is process of hiding implementation details
		
	
	String name;
	
	
	AbstractExample(String name)
	{
		this.name=name;
	}
	
	public void math(int a) 
	{
		System.out.println(a);
	}
	
	public abstract void maximixe();
	
	
	
	
}
