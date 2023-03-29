package baseClass;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver bs;
	
	public static void Launching(String brw) {
		
		if(brw.equalsIgnoreCase("chromedriver")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Downloadsws 64\\chromedriver_win32\\chromedriver.exe");
		 bs = new ChromeDriver();
		}
		else if(brw.equalsIgnoreCase("edgedriver")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNG\\msedgedriver.exe");
			 bs = new EdgeDriver();	
		}
		Waiting(10);

	}
	public static void Opening(String url) {
		bs.get(url);
	}
	
	public static void Maxing() {
		bs.manage().window().maximize();
	}
	
	public static void Sending(WebElement wb, String ab) {
		
		wb.sendKeys(ab);	
		
		
	}
	public void Closing() {
		bs.close();
	}
	
	public void Quiting() {
		bs.quit();
	}
	public static void Clicking(WebElement wc) {
		wc.click();
	}
	public static void Titling() {
		String title = bs.getTitle();
		System.out.println(title);
	}
	public static void Urling() {
		bs.getCurrentUrl();

	}
	public static void Navigating(String ba) {
		bs.navigate().to(ba);
		
	}
	
	public static void Backing() {
		bs.navigate().back();
	}
	public static void Refreshing() {
		bs.navigate().refresh();
	}
	public static void Forwarding() {
		bs.navigate().forward();
	}
	
	public static boolean Isdis(WebElement ele) {
		boolean disp = ele.isDisplayed();     
		return disp;
	}
	public static void Waiting(int r) {
		bs.manage().timeouts().implicitlyWait(r,TimeUnit.SECONDS);
	}
	
	
	//DATA DRIVEN FROM EXCEL 
	
	public static String Reading(int r, int c) throws IOException {
		
		String fileL = "C:\\Users\\Welcome\\Desktop\\testdata2.xlsx";
		FileInputStream fis = new FileInputStream(fileL);      //excel open in input mode
		Workbook wb = new XSSFWorkbook(fis);						// workbook open
		Sheet sheetN = wb.getSheetAt(0);					//sheet
		Row row = sheetN.getRow(r);                       //row
		Cell cell = row.getCell(c);                           //cell
		
		DataFormatter dt = new DataFormatter();
		String fcv = dt.formatCellValue(cell);
		
		return fcv;

	}
	
	public static void Writing(int r, int c, String value) throws IOException {
		
	
	String path ="C:\\Users\\Welcome\\Desktop\\testdata2.xlsx";
	FileInputStream fh = new FileInputStream(path);
	Workbook wb = new XSSFWorkbook(fh);
	Sheet s = wb.getSheet("Sheet1");
	
	Row row = s.getRow(r);
	if(row==null) {
		s.createRow(r);
	}
	Cell cell = row.getCell(c);
	if(cell==null) {
		row.createCell(c,CellType.STRING);
	}
	
	cell.setCellValue(value);
	
	FileOutputStream fos = new FileOutputStream(path);
	wb.write(fos);
	fos.close();
	System.out.println("write conmpleted");
}
	
	public static void Selecting(String option,WebElement ele, String value) {
		
	   Select sct= new Select(ele);
		if (option.equalsIgnoreCase("text")) {
			sct.selectByVisibleText(value);
		}else if(option.equalsIgnoreCase("value")) {
			sct.selectByValue(value);
		}else if(option.equalsIgnoreCase("index")) {
			sct.selectByIndex(Integer.parseInt(value));
		}
		Waiting(10);
	}
	
	public static void W_handling(int wno) {
		Set<String> wh = bs.getWindowHandles();
		int count= 0;
		for(String str : wh) {
			count++;
			if(count==wno) {
				break;
			}
			
		}
	}

}