package SettersAndGetters;

public class SettersAndGettersExample {

        //Homework 1:
	    //Create Registration Class in which you would have
	    //variables as email, userName and password that
	    //have an access scope only within its own class.
	    //After creating an object of the class user should be
	    //able to call methods and in each method separately
	    //pass values to set users email, user name and password

	    //Requirements:
	    //Valid email consider to be only yahoo!
	    //Valid userName and password cannot be empty and should be of length larger than 6 characters.
	    //Also valid password cannot contain userName.
	
	
	private String username;
	private String password;

	public void setUserName(String username) 
	{
		if(!username.isEmpty()) 
		{
			if(username.length()>6) 
			{
				this.username=username;
			}else 
			{
				System.out.println("User name shoud be at least 7 characters");
			}
		}else 
		{
			System.out.println("User name can not be empty");
		}
	}
	
	public String getUserName() 
	{
		return username;
	}
	
	public void setPassword(String password)
	{
		if(!password.isBlank()) 
		{
			if(password.length()>6) 
			{
				if(!password.contains(username)) 
				{
					this.password=password;
				}else 
				{
					System.out.println("Password can not contain username");
				}
			}else 
			{
				System.out.println("Password has to be at least 7 characters");
			}
		}else 
		{
			System.out.println("Password can not be empty");
		}
	}
	
	public String getPassword() 
	{
		return password;
	}
	
}
