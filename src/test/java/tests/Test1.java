package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.BeforeClass;
import org.junit.Test;

import pages.BusquedaAvanzadaPMG;
import pages.LogInPMG;

public class Test1 {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://trunk.northeurope.cloudapp.azure.com:8080/ehHIS-ui");
	}
	
	@Test
	public void TestCrearPaciente() {
		
		LogInPMG myLogInPMGPage = new LogInPMG();
		myLogInPMGPage.testLogInPMG(driver, "administrativo.st-es", "administrativo.st-es");
		
		driver.findElement(By.xpath("//*[@id='zk_comp_34']")).click(); //Hospi
		
		BusquedaAvanzadaPMG myBusquedaAvanzadaPMG = new BusquedaAvanzadaPMG();
		myBusquedaAvanzadaPMG.testBusquedaAvanzadaPMG(driver, "GUTIERREZ", "OCHOA", "Agustin");
	}
}
