package PracticeTest;

import org.testng.Reporter;
import org.testng.annotations.Test;


//changes in branch 2

public class SamplePracticeTest {

//Changes in B1
public class SamplePracticeTest 
{
//CHANGEDD

			@Test
			public void testName() throws Exception 
			{
				String browser = System.getProperty("browser");
				Reporter.log("Byyeee",true);
				Reporter.log(browser,true);
			}
}
