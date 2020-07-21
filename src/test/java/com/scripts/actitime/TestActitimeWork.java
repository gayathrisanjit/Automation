package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.actitime.ActitimeWorkpage;

public class TestActitimeWork extends BaseTest 
{
	@Test
	public void work() throws IOException
	{
		ActitimeWorkpage work=new ActitimeWorkpage(driver);
		work.workmethod();
	}

}
