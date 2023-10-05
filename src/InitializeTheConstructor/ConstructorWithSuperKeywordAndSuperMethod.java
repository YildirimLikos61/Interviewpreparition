package InitializeTheConstructor;

public class ConstructorWithSuperKeywordAndSuperMethod {

	    //Constructor is for initialize the instance variables
		//Similar to the method but Constructor has to has the class name 
		//Constructor doesn't have any return type / method has to have a return type
		//We can not inherit constructor because it is based on object
		//it can not be static //static has nothing to do with it
		//it can not be abstract
		//it can not be final
		//Constructor based on object

	
	String name;
	String lName;
	int age;
	
	ConstructorWithSuperKeywordAndSuperMethod(String name,String lName)
	{
		this.name=name;
		this.lName=lName;
	}
	
}class TestSuper extends ConstructorWithSuperKeywordAndSuperMethod{
	
	TestSuper(String name,String lName ,int age)
	{
		super(name,lName);
		super.age=age;
	}
	
	
	
	
}
