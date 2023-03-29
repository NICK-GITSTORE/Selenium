package demo_tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	
	/* testNG
	 * 1.Annatations 
	 * 		@Before suite (browser launch)
	 * 		@Before test (login)
	 * 		@Before class (search)
	 * 		@Before Method (payment)
	 * 		@Test  (compulsory)
	 * 		@After method
	 * 		@After Class
	 * 		@After Test (logout)
	 * 		@After suite ( scrnshts and report)
	 * */
	
	@Test												// without main method we can run
														// it only capable of run only once
	public void t1() {
		System.out.println("test 1");
	}
	
	@BeforeSuite
	public void meth2() {
		System.out.println("Beforesuite");
	}

	
	@BeforeMethod
	public void meth4() {
		System.out.println("before method");
	}
	@AfterClass
	public void meth5() {
		System.out.println("After class");
	}
	@Test												// before test and after  test is compulsory before and after @test
	public void t2() {
		System.out.println("test 2");
	}
	@AfterSuite
	public void meth6() {
		System.out.println("After suite");
	}
	@BeforeClass
	public void meth7() {
		System.out.println("before class");
	}
	
}
