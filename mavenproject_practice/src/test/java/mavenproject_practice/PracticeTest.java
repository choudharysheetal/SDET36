package mavenproject_practice;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTest {

@Test


public void PracticeTest()
{
		Reporter.log("Automation", true);
		Reporter.log("Script", false);
		System.out.println("RunScript");
		System.out.println("Hi..");
		
	}


	@Test
public void modifyCustomer()
{
	Reporter.log("modifyCustomer",true);
}
}


