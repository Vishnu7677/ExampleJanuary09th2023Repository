package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeBrowserDemo {
	public static WebDriver cbrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		closeApp();

	}
	private static void launchbrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			cbrowser =new ChromeDriver(options);
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	private static void navigateURL()
	{
		try
		{
			cbrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try
		{
			cbrowser.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}



}
