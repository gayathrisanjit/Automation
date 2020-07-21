package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.actitime.ActitimeCustomerpage;

public class TestActitimeCustomer extends BaseTest
{
	@Test
	public void customer() throws IOException
	{
		ActitimeCustomerpage customer=new ActitimeCustomerpage(driver);
		customer.Customermethod();
	}

}
