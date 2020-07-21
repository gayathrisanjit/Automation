package com.pages.actitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.actitime.Autoconstant;
import com.generics.actitime.Basepage;
import com.generics.actitime.ExcelLibrary;

public class ActitimeWorkpage extends Basepage implements Autoconstant
{
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeofworkLink;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofworkLink;
	
	@FindBy(id="name")
	private WebElement nameTextfiled;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement submitButton;
	
	public ActitimeWorkpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void workmethod() throws IOException
	{
		settingsLink.click();
		typeofworkLink.click();
		createtypeofworkLink.click();
		nameTextfiled.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname2, 1, 0));
		submitButton.click();
	}


}
