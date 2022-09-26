package anil;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class login {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	  WebDriver dr = new ChromeDriver();
	  
	  
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  dr.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		dr.findElement(By.name("password")).sendKeys("admin123");
  }
}
