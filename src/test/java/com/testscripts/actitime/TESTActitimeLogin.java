package com.testscripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;
import com.generics.actitime.BaseTest;
import com.pom.actitime.POMActitimeLoginPage;
  
public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActitimeLoginPage p=new POMActitimeLoginPage(driver);
		p.loginMethod();
	}
}
