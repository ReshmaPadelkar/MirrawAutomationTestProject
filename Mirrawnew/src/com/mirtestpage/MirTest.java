package com.mirtestpage;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import com.addtocartpages.AddtoCart;
import com.billdetailsmirpages.BillDetails;
import com.mirloginpages.LoginPage;

public class MirTest {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mirraw.com/");
		driver.manage().window().maximize();

		
		// 1.Login through google account.
		
		LoginPage.login(driver).click();
		LoginPage.loginbtn(driver).click();
		LoginPage.usn(driver).sendKeys("padelkarreshma11@gmail.com");		
		LoginPage.pswd(driver).sendKeys("Pass@123");
		LoginPage.submit(driver).click();
		
		Thread.sleep(2000);
		
		// 2.Perform mouse hovering actions on the menus
		
		Actions act=new Actions(driver);
		
		WebElement tle=driver.findElement(By.xpath(".//*[@id='megamenu-m']/div/ul/li[1]/a"));
		
		WebElement wle=driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[4]/a"));
		
		WebElement ale= driver.findElement(By.xpath(".//*[@id=\'megamenu-m\']/div/ul/li[6]/a"));
		
		Thread.sleep(3000);
		
		act.moveToElement(tle).perform();
		
		Thread.sleep(3000);
		act.moveToElement(wle).perform();
		
		Thread.sleep(3000);
		act.moveToElement(ale).perform();
		
		Thread.sleep(4000);
		
		// 3. Perform scroll down to the last page on Homepage.
		
		((JavascriptExecutor)driver).executeScript("scroll(0,9000)");
		
		Thread.sleep(4000);
		
		//4.Search for the "Sarees" in search bar and print the total number of products found.
		
		AddtoCart.searchprod(driver).sendKeys("Sarees");
		AddtoCart.searchbtn(driver).click();
		String Data = driver.findElement(By.xpath(".//*[@id=\'store-top-content\']/div[1]/div[1]/p")).getText();
	    System.out.println("Total Sarees  " + Data);
	
	    
	    //5.Search for products and added to cart.
	    
	    AddtoCart.searchprod(driver).sendKeys("2511257");
	    AddtoCart.searchbtn(driver).click();
	    AddtoCart.selprod(driver).click();
	    AddtoCart.xxl(driver).click();
	    AddtoCart.addprodone(driver).click();
	    Thread.sleep(3000);
	    AddtoCart.contshop(driver).click();
	    Thread.sleep(3000);
	    AddtoCart.searchprod(driver).sendKeys("2720643");
	    AddtoCart.searchbtn(driver).click();
	    AddtoCart.selprodtwo(driver).click();
	    AddtoCart.selage(driver).click();
	    AddtoCart.addtocartprodtwo(driver).click();
	    Thread.sleep(3000);
	    AddtoCart.contshop(driver).click();
	    Thread.sleep(2000);
	    AddtoCart.searchprod(driver).sendKeys("2766297");
	    AddtoCart.searchbtn(driver).click();
	    AddtoCart.selprodthree(driver).click();
	    AddtoCart.selsize(driver).click();
	    AddtoCart.addtocartprodthree(driver).click();
	    
	    
	    
	    
	    
	    //7.Remove the product from cart.
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(".//*[@id=\"cart-details\"]/div[1]/div[2]/div[1]/a")).click();
	    Thread.sleep(2000);
	    AddtoCart.contshop(driver).click();
	      Thread.sleep(5000);
	    
	    
	      
	    //8. Search for product and open in a new tab.
	    AddtoCart.searchprod(driver).sendKeys("3007294");
	    AddtoCart.searchbtn(driver).click();
	     
	    
	    WebElement e = driver.findElement(By.xpath(".//*[@id=\'design-row-block\']/ul/div/div/div/li/div/a/img"));
	    act.contextClick(e).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	   
	    String mainwindow = driver.getWindowHandle();
	    Thread.sleep(3000);
	    Set<String> handles= driver.getWindowHandles();
	    for(String handle:handles)
	    {
	    	if(!handle.equals(mainwindow))
	    	{
	    	   driver.switchTo().window(handle);
	    	   
	    	}
	    	Thread.sleep(3000);
	    	driver.switchTo().window(mainwindow);
	    }
	    // 9.Select Custome stiching option.
	    
	    ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
	    
	    driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div[2]/div/div[17]/div[1]")).click();
	    driver.findElement(By.xpath(".//*[@id=\'link-prop-263\']/label")).click();
	    Thread.sleep(2000);
	    AddtoCart.selprodfour(driver).click();
	    AddtoCart.addprodfour(driver).click();
	    Thread.sleep(2000);
	    
	    
	    //10.Click on Place Order
	    
	    driver.findElement(By.xpath(".//*[@id=\'checkout']")).click();
	    
	    
	    
	    // 11. Enter Billing Address Details
	    
	    
	    BillDetails.firstname(driver).clear();
	    BillDetails.firstname(driver).sendKeys("Reshma");
	    BillDetails.lastname(driver).clear();
	    BillDetails.lastname(driver).sendKeys("Padelkar");
	    BillDetails.email(driver).clear();
	    BillDetails.email(driver).sendKeys("padelkarreshma11@gmail.com");
	    BillDetails.selcountry(driver).click();
	    BillDetails.pincode(driver).clear();
	    BillDetails.pincode(driver).sendKeys("13569");
	    BillDetails.address1(driver).clear();
	    BillDetails.address1(driver).sendKeys("12 3flr, Green Vally");
	    BillDetails.address2(driver).clear();
	    BillDetails.address2(driver).sendKeys("Piarmid colony, 12Street, Palava Line");
	    BillDetails.city(driver).clear();
	    BillDetails.city(driver).sendKeys("Las Vagas");
	    BillDetails.selstate(driver).click();
	    BillDetails.mobileno(driver).sendKeys("983368790");
	    
	    
	    
	    
	    //12.Select Payment option. 
	    
	    driver.findElement(By.xpath(".//*[@id=\'payment_method\']/div/div[2]/div/div[1]/ul/li[1]/label")).click();
	    
	  
	    //13.Click on Place Order
	    
	    driver.findElement(By.xpath("html/body/div[1]/div[6]/div[2]/div/div[2]/form/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/input")).click();
	    Thread.sleep(3000);
	    
	
	}

	


	}
	


