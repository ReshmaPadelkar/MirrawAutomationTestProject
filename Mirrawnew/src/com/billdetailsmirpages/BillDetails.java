package com.billdetailsmirpages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BillDetails {
	
	
	
	
	public static WebElement wbl;
	
	public static WebElement firstname(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_first_name\']"));
		return wbl;
		
	}
	public static WebElement lastname(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_last_name\']"));
		return wbl;
		
	}
	
	public static WebElement email(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_email\']"));
		return wbl;
		
	}
	public static WebElement selcountry(WebDriver driver)
	{
		wbl = driver.findElement(By.xpath(".//*[@id=\'order_billing_country\']"));
		Select country = new Select(wbl);
		
		country.selectByVisibleText("Egypt");
		return wbl ;
	}
	public static WebElement pincode(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_pincode\']"));
		return wbl;
		
	}
	public static WebElement address1(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_street_line_1\']"));
		return wbl;
		
	}
	public static WebElement address2(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_street_line_2\']"));
		return wbl;
		
	}
	public static WebElement city(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_city\']"));
		return wbl;
		
	}
	public static WebElement selstate(WebDriver driver)
	{
		wbl = driver.findElement(By.xpath(".//*[@id=\'order_billing_state\']"));
		Select sta = new Select(wbl);
		sta.selectByVisibleText("Aswan");
		return wbl;
	}
	
	public static WebElement mobileno(WebDriver driver)
	{
		wbl= driver.findElement(By.xpath(".//*[@id=\'order_billing_phone\']"));
		return wbl;
		
	}
	
	

	
	}



