package com.mirloginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebElement log;
	
	public static WebElement login(WebDriver driver)
	{
		log = driver.findElement(By.xpath(".//*[@class='account-text']"));
		return log;
	}
	
	public static WebElement loginbtn(WebDriver driver)
	{
		log = driver.findElement(By.linkText("Login"));
		return log;
	}
	public static WebElement usn(WebDriver driver)
	{
		log = driver.findElement(By.id("account_email"));
		return log;
	}
	public static WebElement pswd(WebDriver driver)
	{
		log = driver.findElement(By.id("account_password"));
		return log;
	}
	public static WebElement submit(WebDriver driver)
	{
		log = driver.findElement(By.name("commit"));
		return log;
	}

}


