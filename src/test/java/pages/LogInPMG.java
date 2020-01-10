package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPMG {
	
	public void testLogInPMG(WebDriver driver, String user, String pass) {
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='fm1']/div[2]/h2/label")).getText().equals("Login"));
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//*[@id='fm1']/div[2]/div/input[6]")).click();
	}
}
