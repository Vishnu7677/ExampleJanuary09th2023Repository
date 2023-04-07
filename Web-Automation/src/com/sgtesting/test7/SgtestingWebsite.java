package com.sgtesting.test7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SgtestingWebsite {
	static WebDriver cbrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		login();
		logout();
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
			cbrowser.get("http://sgtestinginstitute.com/login.php");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			cbrowser.findElement(By.id("email")).sendKeys("vishnuponangi@gmail.com");
			Thread.sleep(2000);
			cbrowser.findElement(By.id("password")).sendKeys("Vishnu@7677");
			Thread.sleep(1000);
			cbrowser.findElement(By.xpath("/html/body/div[2]/div/div/form/div/button")).click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			Thread.sleep(3000);
			cbrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[9]/a/span")).click();
			Thread.sleep(2000);
			cbrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[9]/ul/li[4]/a")).click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
