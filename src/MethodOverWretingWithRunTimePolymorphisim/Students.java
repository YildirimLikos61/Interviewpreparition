package MethodOverWretingWithRunTimePolymorphisim;

public class Students {

	//Homework 2:
	// ▪ Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
	// ▪ Define common behavior within the parent class and override some of the methods in the child classes
	// ▪ Define some methods specific to the child classes
	 //▪ Write an example of achieving run time polymorphism

	//RunTime pollymorphism is happening with method overWriding
	//It requires inheritance
	//When we do up casting parent class will act like a child class 
	
	
	String StudentType;
	
	Students(String StudentType)
	{
		this.StudentType=StudentType;
	}
	
	
	public void study() 
	{
		System.out.println(StudentType+" students stuies");
	}
	
	public void sleep() 
	{
		System.out.println(StudentType +" the students sleeps");
	}
	
	public void goesToScholl() 
	{
		System.out.println(StudentType+" goes to scholl");
	}
	
}class NeotechStudents extends Students{

	NeotechStudents(String StudentType) 
	{
		super(StudentType);
	}
	
	public void study() 
	{
		System.out.println(StudentType+" students stuies");
	}
	
	public void getJop()
	{
		System.out.println(StudentType+" will get a jop after bootcamp");
	}
	
} class SchollStudent extends Students{
	
	SchollStudent(String StudentType)
	{
		super(StudentType);
	}
	
	public void study() 
	{
		System.out.println(StudentType+" students stuies");
	}
	
	public void semester() 
	{
		System.out.println(StudentType+" has semster");
	}
	
}class CollegeStudent extends Students{

	CollegeStudent(String StudentType) 
	{
		super(StudentType);
	}
	
	public void study() 
	{
		System.out.println(StudentType+" students stuies");
	}
	
	public void twoyears()
	{
		System.out.println(StudentType+" stuies for 2 years");
	}
}
