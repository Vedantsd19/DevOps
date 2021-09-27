package login;

import java.io.FileInputStream;

import java.util.Properties;

public class App {
	
	public boolean userLogin(String userName,String password)
	{
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("src/main/resources/credentials.property"));
		} catch (Exception e) {
			System.out.println("Error with file reading");
		}
		String un = prop.getProperty("user");
		String pwd = prop.getProperty("password");
		
		if(userName.equals(un) && password.equals(pwd))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
