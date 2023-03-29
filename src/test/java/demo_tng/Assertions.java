package demo_tng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClass.Base;

public class Assertions extends Base {
	
	
	// Assert   (Hard asset)  - soft asset- if validation fails, it moves to next case
	// assertequals
	// assertnotequals
	// asserttrue
	// assertfalse
	// assertnull
	//assertnotnull-
	
	
	// for validation and verifications
	
	
	@Test
    private void asserts() {
		Launching("edgedriver");
		Opening("https://www.amazon.in/");
		boolean isdis = Isdis(bs.findElement(By.id("nav-logo-sprites")));
		
		
		Assert.assertTrue(isdis);
//		Assert.assertFalse(isdis);			
	
	}
	
	@Test
	private void ass() {
		String a="world";
		String b="woorld";
		
		boolean equals = a.equals(b);
		
//		Assert.assertEquals(a,b); 
		Assert.assertNotEquals(a,b);
		
//		SoftAssert sa = new SoftAssert();		// it omit failure test case
//		sa.assertEquals(a,b);
//		sa.assertAll();			// it passes though test case failed, also it prints why failed

	}
	
	@Test
	private void nullu() {
		String a=null;
		Assert.assertNull(a);
//		Assert.assertNotNull(a);

	}

}
