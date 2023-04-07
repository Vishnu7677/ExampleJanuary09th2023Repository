package com.sgtesting.tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindowComponents {
	public static WebDriver cbrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		Importtasks();
		logout();
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
	private static void login()
	{
		try
		{
			cbrowser.findElement(By.id("username")).sendKeys("admin");
			cbrowser.findElement(By.name("pwd")).sendKeys("manager");
			cbrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			cbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Importtasks()
	{
		try
		{
			cbrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			cbrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			cbrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			Thread.sleep(2000);
			cbrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String filepath="D:\\study\\Automation\\Sample.csv";
			copyfilepath(filepath);
			Thread.sleep(2000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			cbrowser.findElement(By.xpath("//*[@id=\"loadTasksFromCSVPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			cbrowser.findElement(By.id("closeLoadTasksFromCSVPopupButton")).click();
			Thread.sleep(3000);
			cbrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(3000);
			cbrowser.findElement(By.xpath("//span[text()='Delete']")).click();
			Thread.sleep(3000);
			cbrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void copyfilepath(String filepath)
	{
		StringSelection Selection=new StringSelection(filepath);
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection,null);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(Selection, null);
	}
	private static void logout()
	{
		try
		{
			cbrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
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
