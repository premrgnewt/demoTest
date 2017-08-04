package testscenario;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJava {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test
	public void test()
	{
		System.out.println("welcome");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	

}
