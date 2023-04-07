package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		closeApp();
	}
	private static void launchbrowser()
	{
		try
		{
			obrowser=new FirefoxDriver();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	private static void navigateURL()
	{
		try
		{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try
		{
			obrowser.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
