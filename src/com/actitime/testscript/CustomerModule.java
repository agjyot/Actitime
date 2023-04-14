package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;


@Listeners(com.actitime.generic.ListenerImplementation.class)

public class CustomerModule extends BaseClass {

	@Test
	public void testCreateCustomer() {
	Reporter.log("createcustomer",true);
	
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	
	TaskListPage t= new TaskListPage(driver);
	
	
	t.getAddNew().click();
	
	t.getNewCustomer().click();
	
	t.getEnterCustomerName().sendKeys("HDFC_001");
	
	t.getEnterCustomerDescription().sendKeys("Banking project");
	
	t.getSelectCustomerDD().click();
	
	
	t.get
	
	t.getOurCompony().click();
	
	t.getCreateCustomer().click();
	
}
}
