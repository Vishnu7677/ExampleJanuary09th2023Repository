package com.sgtesting.test7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaTpopint {
	static WebDriver cbrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		java();
		getsize();
		getlinks();
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
			cbrowser.get("https://www.javatpoint.com");
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void java()
	{
		try
		{
			cbrowser.findElement(By.xpath("//a[text()=' Java']")).click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void getsize()
	{
		try 
		{
			Thread.sleep(2000);
			List<WebElement> links=cbrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of Links in Application :"+links.size());
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	private static void getlinks()
	{
		try
		{
			Thread.sleep(2000);
			List<WebElement> links=cbrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<links.size();i++)
			{
				WebElement link=links.get(i);
				System.out.println(link.getText());
				Thread.sleep(500);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
