package com.sample.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest 
{
	@Test
	public void demo()
	{
		Reporter.log("demotest" , true);
	}
}