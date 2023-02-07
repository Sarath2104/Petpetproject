package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert l;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	

	// 1
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		}
	// 2
	public static void launchUrl(String url) {
		driver.get(url);
		}
	// 3
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		}
	// 4
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		}
	// 5
	public static void passValues(WebElement element,String usertext) {
		
		element.sendKeys(usertext);

	}
	
	// 6
	public static void click(WebElement element) {
		element.click();
		

	}
	
	public static String toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
		

	}
	
	public static void ScreenShot(String name) throws IOException {
		
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		
		File dsc =new File ("C:\\Users\\admin\\eclipse-workspace\\Cucumber\\ScreenShot"+name+".jpg");
		FileUtils.copyFile(src, dsc);
	}
	// 7
	public static void quit() {
		driver.quit();
		

	}
	// 8
	public static void toClose() {
		driver.close();
	

	}
	// 9
	public static void toMaximize() {
		driver.manage().window().maximize();
		

	}
	// 10
	public static void toMinimize() {
		driver.manage().window().maximize();

	}
	// 11
	public static void toPerformMoveToElement(WebElement element) {
		a=new Actions (driver);
		a.moveToElement(element).perform();
		

	}
	// 12
	public static void toDragAndDrop(WebElement src, WebElement dest) {
		
		a.dragAndDrop(src, dest).perform();
	}
	// 13
	public static void toPerformDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
		

	}
	// 14
	public static void toPerformEnter() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}
	// 15
	public static void toPressTab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	

	}
	// 16 
	public static void toKeyUp() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}
	// 17
	public static void toKeyDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	// 18
	public static void toDoubleClick() {
		a.doubleClick().perform();

	}
	// 19
	public static void toContextClick() {
		a.contextClick().perform();
		

	}
	// 20
	public static void toSwitchTo() {
		driver.switchTo().alert();

	}
	// 21
	public static void toGetTextFromAlert(String element) {
		l.getText();
	

	}
	// 22
	public static void toAcceptTheAlert() {
		l.accept();

	}
	// 23
	public static void todismissTheAlert() {
		l.dismiss();

	}
	// 24 
	public static void toPerformScrollUp(WebElement element) {
		JavascriptExecutor driver;
		js.executeScript("arguments[0].scrollIntoView(fasle)", element);
		
	

	}
	// 25
	public static void toPerformScrolldown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		

	}
	// 26
	public static void replaceForSendKeys(WebElement element) {
		js.executeScript("arguments[0].SetAttribute('value','String')", element);

	}
	// 27
	public static void replaceForgetAttribute(WebElement element) {
	js.executeScript("return arguments [0].getAttribute('value')", element);

	}
	// 28
	public static void frmaeById(String index) {
		driver.switchTo().frame(index);

	}
	
	// 29
	public static void frameByName(String index) {
	driver.switchTo().frame(index);

	}
	// 30
	public static void frameByWebElement(WebElement element) {
	driver.switchTo().frame(element);

	}
	// 31
	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
		

	}
	// 32 
	public static void switchToMainFrame() {
		driver.switchTo().defaultContent();
		
	

	}
	



	
	public static String excelRead(int rowNo, int cellNo) throws IOException {
		
File f=new File("C:\\Users\\admin\\eclipse-workspace\\Frame\\Excel sheet\\datadriven example.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(fi);
		
		Sheet sh = book.getSheet("Sheet1");
		
	
			Row ro = sh.getRow(rowNo);
	
			Cell ce = ro.getCell(cellNo);
			
			int ct = ce.getCellType();
			
			String value = "";
			
			if (ct==1) {
				value = ce.getStringCellValue();
				
			}
			else if (DateUtil.isCellDateFormatted(ce)) {
				Date d = ce.getDateCellValue();
				
				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
				value = sim.format(d);
				
				}

			else {
				
				double nv = ce.getNumericCellValue();
				long l=(long)nv;
				value = String.valueOf(l);
				
			}
			return value;
			
		}
	
	private void Inform() {
		driver.manage().window().maximize();
		System.out.println("Good Morning Sarath");

	}

	

	
}
	
	
	

