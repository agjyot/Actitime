package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private  WebElement addNew;
	
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private  WebElement newCustomer;
	
	
	@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private  WebElement enterCustomerName;
	
	
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private  WebElement enterCustomerDescription;
	
	@FindBy (xpath="(//div[text()='- Select Customer -'])[1]")
	private  WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private  WebElement ourCompony;
	
	@FindBy (xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	
	
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}





	public WebElement getAddNew() {
		return addNew;
	}





	public WebElement getNewCustomer() {
		return newCustomer;
	}





	public WebElement getEnterCustomerName() {
		return enterCustomerName;
	}





	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}





	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}





	public WebElement getOurCompony() {
		return ourCompony;
	}





	public WebElement getCreateCustomer() {
		return createCustomer;
	}
	
	
	
	
	
	
}





