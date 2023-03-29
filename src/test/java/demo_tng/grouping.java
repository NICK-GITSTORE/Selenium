package demo_tng;

import org.testng.annotations.Test;

public class grouping {
	
	@Test(groups = "smoke")
	public void browser() {
		
	}

	@Test(groups = "regression")
	public void Login() {
		
	}
	
	@Test(groups = "sanity")
	public void search() {
		
	}
	
	@Test(groups = "smoke")
	public void Payment() {
		
	}
	
	@Test(groups = {"smoke","regression"})
	public void Addtocart() {
		
	}
	
	// include - runs only this group
	// exclude - run all group except that group
}
