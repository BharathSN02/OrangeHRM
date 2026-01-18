package test;

import org.testng.annotations.Test;

import base.BaseTest;
import loginpage.LoginPage;
import new_employee.New_Employee;
import viewlist.ViewEmpList;

public class LoginTest extends BaseTest {
	@Test
	public void testValidLogin() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		Thread.sleep(1000);
		loginpage.enterUsername("BharathSN01");
		//loginpage.enterUsername("Admin");
		Thread.sleep(1000);
		loginpage.enterPassword("bharathSN@123");
		//loginpage.enterPassword("admin123");
		Thread.sleep(1000);
		loginpage.clickLogin();

		System.out.println("Title of the page is: " + driver.getTitle());

		New_Employee newemp = new New_Employee(driver);
		Thread.sleep(1000);
		newemp.clickPIM();
		Thread.sleep(1000);
		newemp.clickAddEmployee();
		Thread.sleep(1000);
		newemp.firstName("Akshay");
		Thread.sleep(1000);
		newemp.middleName("");
		newemp.lastName("VN");
		Thread.sleep(1000);
		newemp.clicksave();

		ViewEmpList viewList = new ViewEmpList(driver);
		Thread.sleep(1000);
		viewList.clickList();

	}

}
