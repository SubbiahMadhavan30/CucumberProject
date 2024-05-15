package org.hastag;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.netty.handler.codec.http.multipart.FileUpload;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Alert y;
	public static Navigation n;
	public static JavascriptExecutor js;
	public static Select s;
	public static Robot r;
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook w;
	public static Cell c;
	
	public static void launchBrowser(String browsertype)  {
		if (browsertype.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("edgelaunchbrowser");

		} else if (browsertype.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("firefoxlaunchbrowser");

		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("chromelaunchbrowser");
		}
	}

	// 1 Loading Browser
	public static void loadBrowser() {
//		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	// 2 To Launch Url
	public static void launchurl(String url) {
		driver.get(url);
	}

	// 3 To close the browser
	public static void closeBrowser() {
		driver.close();
	}

	// 4 To Enter the text
	public static void entertext(WebElement element, String text) {
		element.sendKeys(text);
	}

	// 5 To Click the Element
	public static void clickElement(WebElement element) {
		element.click();
	}

	// 6 To Maximize the Browser
	public static void maximizeBrowser() {
		driver.manage().window().maximize();

	}

	// 7 To Minimize the Browser
	public static void minimizeBrowser() {
		//driver.manage().window().minimize();

	}

	// 8 Pause Execution
	public static void pauseExecution(long milliSecond) {
		try {
			Thread.sleep(milliSecond);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	// 9 Applying Waits To All Elements
	public static void applywaitsToAllElements() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	// 10 To Get the Current Page Title
	public static String getcurrentPageTitle() {
		return driver.getTitle();
	}

	// 11 To Get the Current Page Url
	public static String getCurrentpageUrl() {
		return driver.getCurrentUrl();
	}

	// 12 To Get the Attribute Value
	public static String attribute(WebElement element, String attributename) {
		return element.getAttribute(attributename);
	}

	// 13 To Get the Text
	public static String gettingtext(WebElement element) {
		return element.getText();
	}

	// 14 Move To Element
	public static void moveCursorElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	// 15 To Drag And Drop
	public static void draggingAndDropping(WebElement source, WebElement destination) {
		a = new Actions(driver);
		a.dragAndDrop(source, destination);

	}
 // 16 To btn Click
	public static void btnClick(WebElement element) {
	  element.click();

	}
	// 16 To Right Click
	public static void contextclk(WebElement element) {
		a.contextClick(element).perform();

	}

	// 17 To Double Click
	public static void doubleclk(WebElement element) {
		a.doubleClick(element).perform();
	}

	// 18 To Accept the alert
	public static void accepting(WebElement element) {
		y = driver.switchTo().alert();
	}

	// 19 To Dismiss in alert
	public static void dismissing() {
		y = driver.switchTo().alert();

	}

	// 20 To Enter the text in alert
	public static void sendtexting(String text) {
		y.sendKeys(text);
	}

	// 21 To Get the Text in Alert
	public static void gettingtexting(String text) {
		y.getText();

	}

	// 22 To Navigate the Browser in backward
	public static void navigattingBrowser() {
		n = driver.navigate();
		driver.navigate().back();
		;
	}

	// 23 To Navigate the Browser in forward
	public static void navigattingBrowserforward() {
		driver.navigate().forward();
	}

	// 24 To page refresh
	public static void pageRefersh() {
		driver.navigate().refresh();

	}

	// 25 To Close the Browser
	public static void closeBrowswer() {
		driver.close();

	}

	// 26 To Quit the Browser
	public static void quitting() {
		driver.quit();

	}

	// 27 JavaExecutor getAttribute
	public static Object getValueJavaScript(WebElement element) {
		return js.executeScript("return arguments[0].getAttribute('value')", element);
	}

	// 28 To click using JavascriptExecutor
	public static void clickUsingJavascriptExecutor(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}

	// 29 To Scroll UP
	public static void scrollUpUsingJavascriptExecutor(WebElement element) {
		js.executeScript("arguments[0]).ScrollIntoView(true)", element);

	}

	// 30 To Scroll down
	public static void scrollDownUsingJavascriptExecutor(WebElement element) {

		js.executeScript("arguments[0]).ScrollIntoView(false)", element);

	}

	// 31 is displayed
	public static boolean isDisplayedd(WebElement element) {
		return element.isDisplayed();

	}

	// 32 is selected
	public static boolean isSelectedd(WebElement element) {
		return element.isSelected();
	}

	// 33 is enabled
	public static boolean isEnabledd(WebElement element) {
		return element.isEnabled();

	}

	// 34 To select by value
	public static void selectByValuee(WebElement element, String Value) {
		s=new Select(element);
		s.selectByValue(Value);
		

	}

	// 35 To select by index
	public static void selectByIndexx(WebElement element, int index) {
		s=new Select(element);
		s.selectByIndex(index);
	}

	// 36 To select visible text
	public static void selectByVisibleTextt(WebElement element, String Value) {
		s=new Select(element);
		s.selectByVisibleText(Value);
	}

	// 37 To check whether is multiple
	public static boolean isMultiplee() {
		return s.isMultiple();
	}

	// 38 To Deselect by index
	public static void deSelectByIndex(WebElement element, int index) {
		s.deselectByIndex(index);
	}

	// 39 To Deselect by value
	public static void deSelectByValue(WebElement element, String Value) {
		s.deselectByValue(Value);
	}

	// 40 To Deselect by visible text
	public static void deSelectByVisibleText(WebElement element, String Value) {
		s.deselectByVisibleText(Value);
	}

	// 41 To Deselectall
	public static void deSelectAll(WebElement element) {
		s.deselectAll();
	}

	// 42 To Switch into frames // Method Overloading
	public static void nameFrame(String name) {
		driver.switchTo().frame(name);
	}

	// 43 To idFrame
	public static void idFrame(String id) {
		driver.switchTo().frame(id);
	}

	// 44 To Element frame
	public static void elementFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 45 Index Frame
	public static void indexFrame(int index) {
		driver.switchTo().frame(index);
	}

	// 46 To Parent Frame
	public static void parntFrame() {
		driver.switchTo().parentFrame();
	}

	// 47 To Defaultcontext frame
	public static void defaultContxtFrame() {
		driver.switchTo().defaultContent();
	}

	// 48 To Launch the Url using WindowsHandling
	public static void urlWindows(String url) {
		driver.switchTo().window(url);
	}

	// 49 To get the Title using WindowsHandling
	public static void titleWindows(String title) {
		driver.switchTo().window(title);
	}

	// 50 id using WindowsHandling
	public static void idWindows(String WindowsId) {
		driver.switchTo().window(WindowsId);
	}
	

	// 51 Parent window
	public static String parntWindow() {
		return driver.getWindowHandle();

	}
	// 52 To clear
	public static void clear(WebElement element) {
		element.clear();
	}

	public static String readDataFromExcel(String name, int rowno, int cellno, String filename) throws IOException {
		File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\MavSampleProject\\ExcelFiles\\" + filename + ".xlsx");
		fi = new FileInputStream(f); 
			w = new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet(name);
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String value = null;
		if (type == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMM,YY");
			value = sim.format(d);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}

	// write Excel
	public static void writeExcel(String filename, String Sheetname, int newRow, int newCell, String value)
			throws IOException {
		File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\MavSampleProject\\ExcelFiles\\" + filename + ".xlsx");
		w = new XSSFWorkbook();
		Sheet s = w.createSheet(Sheetname);
		Row r = s.createRow(newRow);
		Cell c = r.createCell(newCell);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	// createcell only
	public static void createcellonly(String filename, String sheetname, int newRow, int newcell, String value)
			throws IOException {
		File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\MavSampleProject\\ExcelFiles\\" + filename + ".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(newRow);
		Cell c = r.createCell(newcell);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("done");

	}

	// Create Row only
	public static void createrowonly(String filename, String sheetname, int newRow, int newCell, String value) throws IOException {
		File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\MavSampleProject\\ExcelFiles\\" + filename + ".xlsx");
		
			FileInputStream fi = new FileInputStream(f);
		
		
			w = new XSSFWorkbook(fi);
	
		Sheet s = w.getSheet(sheetname);
		Row r = s.createRow(newRow);
		   c = r.createCell(newCell);
		c.setCellValue(value);
	
			FileOutputStream fo = new FileOutputStream(f);
		
	
			w.write(fo);
	 System.out.println("done");

	}
	//Takescreenshot
	public static void takesnap(String filename) {
	TakesScreenshot	ts= (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Screenshots\\"+filename+".png");
	try {
		FileUtils.copyFile(src, dest);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	
	// create Excel Row and column
	public static void createExcelRowandColumn(String filename, String sheetname,int rowno, int cellno, String value) throws IOException {
		File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\MavSampleProject\\ExcelFiles\\" + filename + ".xlsx");
          if (rowno==0 && cellno==0) {
        	   w = new XSSFWorkbook();
        	   Sheet s = w.createSheet(sheetname);
        	   Row r = s.createRow(rowno);
        	    c = r.createCell(cellno);
			
		} else if (rowno>=0 && cellno > 0) {
			fi = new FileInputStream(f);
			w = new XSSFWorkbook(fi);
			Sheet s = w.getSheet(sheetname);
			Row r = s.getRow(rowno);
			 c = r.createCell(cellno);
			
		}else if (rowno > 0 && cellno == 0) {
			fi = new FileInputStream(f);
			w= new XSSFWorkbook(fi);
			Sheet s = w.getSheet(sheetname);
			Row r = s.createRow(rowno);
			c = r.createCell(cellno);
		}
          c.setCellValue(value);
          fo = new FileOutputStream(f);
          w.write(fo);
          System.out.println("done");
	}
	

}
