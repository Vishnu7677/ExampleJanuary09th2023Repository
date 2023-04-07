package com.sgtesting.test7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeCustomer {
	static WebDriver cbrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		delete();
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
	private static void login()
	{
		try
		{
			cbrowser.findElement(By.name("username")).sendKeys("admin");
			cbrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			cbrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			cbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try
		{
			cbrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			cbrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			cbrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			cbrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Vishnu");
			Thread.sleep(1000);
			cbrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void delete()
	{
		try
		{
			cbrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(5000);
			cbrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(4000);
			cbrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(4000);
			cbrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(4000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
