package com.sgtesting.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateUsersAndDeleteAll {
	public static WebDriver oBrowser;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		User1login();
		popupwindow();
		createUser2();
		logout();
		User2login();
		popupwindow();
		createUser3();
		logout();
		User3login();
		popupwindow();
		logout();
		User2login();
		Modifyuser2();
		logout();
		Userlogin2();
		logout();
		User1login();
		Modifyuser1();
		logout();
		Userlogin1();
		logout();
		login();
		Modifyuser();
		logout();
		user1();
		logout();
		Userlogin1();
		deleteUser2();
		logout();
		user1();
		deleteUser1();
		logout();
		login();
		deleteUser();
		logout();
		closeApp();

	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	private static void User1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void popupwindow()
	{
		try
		{
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();	
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	private static void User2login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	private static void User3login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void Modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo2']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("7677");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("7677");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void Userlogin2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("7677");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void Modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("7677");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("7677");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	private static void Userlogin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("7677");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void Modifyuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='User, demo']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("7677");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("7677");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void user1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser");
			oBrowser.findElement(By.name("pwd")).sendKeys("7677");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo2']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			System.out.println(oBrowser.switchTo().alert().getText());
			oBrowser.switchTo().alert().accept();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			System.out.println(oBrowser.switchTo().alert().getText());
			oBrowser.switchTo().alert().accept();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='User, demo']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			System.out.println(oBrowser.switchTo().alert().getText());
			oBrowser.switchTo().alert().accept();
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
