package demo_tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.Base;

// depends on method ,it run precondition cases and after that it runs

public class depndson extends Base{
	
	@Test
	public void Search() {
		Launching("edgedriver");
		Opening("https://www.amazon.in/ref=nav_logo");
		Maxing();
	}
	
	@Test(dependsOnMethods = "Search")	
	public void functions() {
		WebElement  aa = bs.findElement(By.id("twotabsearchtextbox"));
		aa.clear();
		aa.sendKeys("iphone\n");
		
	}

}
