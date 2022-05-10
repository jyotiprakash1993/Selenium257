package com.sample.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.sample.generics.BaseTest;
import com.sample.pom.SampleFrameworkPage;


public class SampleFrameworkTest extends BaseTest
{
	@Test
	public void submit() throws IOException, InterruptedException
	{
		Reporter.log("test method is executing" , true);
		
		SampleFrameworkPage sample=new SampleFrameworkPage(driver);
		sample.submitdetails();
	}
}