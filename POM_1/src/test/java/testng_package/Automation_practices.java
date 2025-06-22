package testng_package;

import org.testng.annotations.Test;

import base_package01.Base_class_01;
import page_object_model001.Demo_01;
import page_object_model001.Demo_2;

import org.testng.annotations.BeforeSuite;


import org.testng.annotations.AfterSuite;

public class Automation_practices extends Base_class_01 {
	@Test(priority = 1)
	public void verify_Account() {

		Demo_01 dm = new Demo_01(driver);
		dm.Account();
	}

	@Test(priority = 2)
	public void personal_information() {

		Demo_2 dm2 = new Demo_2(driver);
		dm2.personal_info();
	}

	@BeforeSuite
	public void beforeSuite() {

		launch_Browser("chrome");
		Hiturl("https://www.automationpractice.pl/");
	}

	@AfterSuite
	public void afterSuite() {
	}

}
