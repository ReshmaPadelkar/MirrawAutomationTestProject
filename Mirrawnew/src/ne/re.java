package ne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver wd = new FirefoxDriver();
wd.get("https://www.mirraw.com/");
wd.findElement(By.xpath("//*[@id='account-show']/span[2]")).click();
wd.findElement(By.linkText("Login")).click();
wd.findElement(By.id("account_email")).sendKeys("padelkarreshma11@gmail.com");
wd.findElement(By.id("account_password")).sendKeys("Pass@123");
	}

}
