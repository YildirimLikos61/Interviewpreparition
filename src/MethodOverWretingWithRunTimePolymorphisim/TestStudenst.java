package MethodOverWretingWithRunTimePolymorphisim;

public class TestStudenst {

	public static void main(String[] args) {
		
		//Run time Pollymorphisim
		
		Students[] s= {new NeotechStudents("Neotech Student"),new SchollStudent("Scholl Student"),new CollegeStudent("College Student")};
		
		for(Students s1:s)
		{
			s1.study();
			s1.goesToScholl();
			s1.sleep();
		}
		System.out.println();
		System.out.println();
		
	
		//DownCasting
		
		Students student=new NeotechStudents("NeotechStudents");
		
		NeotechStudents neo=(NeotechStudents)student;
		
		neo.sleep();
		neo.getJop();
		neo.goesToScholl();
		neo.study();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
