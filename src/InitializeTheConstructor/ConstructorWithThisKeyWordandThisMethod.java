package InitializeTheConstructor;

public class ConstructorWithThisKeyWordandThisMethod {

	String name;
	String lName;
	
	int age;
	
	ConstructorWithThisKeyWordandThisMethod(String name,String lName)
	{
		this.name=name;
		this.lName=lName;
	}
	
	
	ConstructorWithThisKeyWordandThisMethod(String name,String lName,int age)
	{
	    this(name,lName);
	    this.age=age;
	}
	
	
}
