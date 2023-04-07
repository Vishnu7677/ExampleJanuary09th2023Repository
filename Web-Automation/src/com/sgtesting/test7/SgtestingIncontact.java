package com.sgtesting.test7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SgtestingIncontact {
	static WebDriver cbrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();

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
			cbrowser.get("http://sgtestinginstitute.com");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Testimonial()
	{
		try
		{
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
