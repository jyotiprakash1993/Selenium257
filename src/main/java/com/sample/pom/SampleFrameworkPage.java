package com.sample.pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sample.generics.AutoConstant;
import com.sample.generics.BasePage;
import com.sample.generics.ExcelLibrary;
import com.sample.generics.Helper;


public class SampleFrameworkPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;	

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;	

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement usernameTextfield;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement emailidTextfield;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement maleRadiobutton;	

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement femaleRadiobutton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement remembermeCheckbox;
	
	@FindBy(xpath = "//select[@name='countrycode']")
	private WebElement countrycodeDropdownlist;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement mobilenoTextfield;
	
	public SampleFrameworkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void submitdetails() throws IOException, InterruptedException
	{
		Helper.highlightelement(driver, firstnameTextfield);
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 0));
		Helper.highlightelement(driver, lastnameTextfield);
		lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 1));
		Helper.highlightelement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 2));
		Helper.highlightelement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 3));
		emailidTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 4));
		femaleRadiobutton.click();
		remembermeCheckbox.click();
		selectbyvisibletext(countrycodeDropdownlist, "+33");
		mobilenoTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 5));
	}
}