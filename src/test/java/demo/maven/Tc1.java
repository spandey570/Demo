package demo.maven;

import org.testng.annotations.Test;

public class Tc1 extends Basic{
	
	@Test
	public void TestFlow1()
	{
		System.out.println("TestFlow1 is running");
	}

	@Test
	public void TestFlow2()
	{
		System.out.println("TestFlow2 is running");
	}
	
	@Test
	public void TestFlow3()
	{
		System.out.println("TestFlow3 is running");
	}
}
