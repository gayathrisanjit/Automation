package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Basepage;
import com.generics.actitime.ExcelLibrary;

public class ActitimeLoginPage extends Basepage implements Autoconstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwrodTextfield;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginmethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 0));
		passwrodTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
		loginButton.click();
		
	}

}
