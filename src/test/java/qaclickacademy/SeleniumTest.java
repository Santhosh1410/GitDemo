package qaclickacademy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	//maven surefire plugin used to execute all the testcases in maven project
	//surefire plugin can be got from  following link and paste the code in pom.xml http://maven.apache.org/surefire/maven-surefire-plugin/usage.html 
	//repository path - C:\Users\HP\.m2\repository
	@Test
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void elementsUI()
	{
		System.out.println("elementsUI");
	}

}
