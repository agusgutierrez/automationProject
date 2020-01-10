package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusquedaAvanzadaPMG {
	
	public void testBusquedaAvanzadaPMG(WebDriver driver, String firstSurname, String secondSurname, String name){
			
		WebDriverWait myWait = new WebDriverWait(driver, 30);
		
		//myWait.until(ExpectedConditions.attributeToBe(By.xpath("//*[@id='zk_comp_137']"), "class", "##patientSearchComponent.advancedSearch.buttonHN z-a"));
		myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='zk_comp_137']")));
		driver.findElement(By.xpath("//*[@id='zk_comp_137']")).click(); // Busqueda avanzada	
		
		String valueOfClassSurname = "##patientAdvancedSearch.surname1_4132414109431704310 z-textbox bgInputObligatorio";
		myWait.until(ExpectedConditions.attributeToBe(By.xpath("//*[@id='zk_comp_1070']"), "class", valueOfClassSurname));
		
		driver.findElement(By.xpath("//*[@id='zk_comp_1070']")).sendKeys(firstSurname);
		driver.findElement(By.xpath("//*[@id='zk_comp_1074']")).sendKeys(secondSurname);
		driver.findElement(By.xpath("//*[@id='zk_comp_1078']")).sendKeys(name)
	}
}



// <input id="zk_comp_1070" style="width: 255px; background-color: rgb(255, 255, 204);" class="##patientAdvancedSearch.surname1_4132414109431704310 z-textbox bgInputObligatorio" title="Primer apellido" value="" type="text" maxlength="250">
