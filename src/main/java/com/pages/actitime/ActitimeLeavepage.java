package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Basepage;

//import generics.ExcelLibrary;

public class ActitimeLeavepage extends Basepage implements Autoconstant
{
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypeLink;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement createleavetypeLink;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement nameTextfield;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement submitLink;
	
	public ActitimeLeavepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void leavementhod() throws IOException
	{
		settingsLink.click();
		leavetypeLink.click();
		createleavetypeLink.click();
		//nameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname3, 1, 0));
		submitLink.click();
	}
	

}
