package demo_tng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.Base;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class priority extends Base {
	
	@BeforeMethod
	public void launch() {
		Launching("edgedriver");
		Opening("https://www.amazon.in/");
		Maxing();
	}
	@Test(priority = 2)
	public void Search() {
		Sending(bs.findElement(By.id("twotabsearchtextbox")),"nokia\n");
	}
	
	@Test(priority = 1)   // arrange test case order
	public void addcart() {
		Sending(bs.findElement(By.id("twotabsearchtextbox")),"nokia\n");
		Clicking(bs.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")));
		
		Clicking(bs.findElement(By.xpath("//span[@id='productTitle']")));
		
	}
//	@AfterMethod
//	public void quit() {
//		Quiting();
//	}
	

}
