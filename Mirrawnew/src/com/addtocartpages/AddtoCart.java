package com.addtocartpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCart {

	
    public static WebElement sel;
	
	public static WebElement searchprod(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'unbxd_autosuggest_field\']"));
		return sel;                                            
		
	}
	
	public static WebElement searchbtn(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'tfheader\']/form/input[3]"));
		return sel;
		
	}
	
	public static WebElement selprod(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'design-row-block\']/ul/div/div/div/li/div/a/img"));
		return sel;
		
	}
    
	public static WebElement xxl(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'4332435\']"));
		return sel;
		
	}
	
	public static WebElement addprodone(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'2511257\']/div/span[2]"));
		return sel;
		
	}
    
	public static WebElement contshop(WebDriver driver)
	{
		sel= driver.findElement(By.xpath("html/body/div[1]/div[6]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[4]/div/a"));
		return sel;
		
	}
	
	public static WebElement selage(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'4551201\']"));
		return sel;
		
	}
	
	public static WebElement selprodtwo(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'design-row-block\']/ul/div/div/div/li/div/a/img"));
		return sel;
		
	}
	public static WebElement addtocartprodtwo(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'2720643\']/div"));
		return sel;
		
	}
	
	public static WebElement selprodthree(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'design-row-block\']/ul/div/div/div/li/div/a/img"));
		return sel;
		
	}
	
	public static WebElement addtocartprodthree(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'2766297\']/div/span[2]"));
		return sel;
		
	}
	public static WebElement selsize(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'4587959\']"));
		return sel;
		
	}
	public static WebElement addprodfour(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id='3007294']/div/span[1]"));
		return sel;
		
	}
	
	public static WebElement selprodfour(WebDriver driver)
	{
		sel= driver.findElement(By.xpath(".//*[@id=\'design-row-block\']/ul/div/div/div/li/div/a/img"));
		return sel;
		
	}
		
	
}
