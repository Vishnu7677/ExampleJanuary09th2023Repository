package com.sgtesting.test7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YoutubeHistory {
	static WebDriver cbrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		history();

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
			cbrowser.get("https://www.youtube.com/");
			Thread.sleep(8000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void history()
	{
		try
		{
		cbrowser.findElement(By.xpath("//*[text()='History']")).click();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
