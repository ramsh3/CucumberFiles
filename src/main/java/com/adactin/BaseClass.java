package com.adactin;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions act;
	public static Robot bot;
	public static Select select;
	public static TakesScreenshot snap;
	public static JavascriptExecutor scroll;

	public static WebDriver browserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\hp\\eclipse-workspace\\UsingMaven\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {

			} else {
				System.out.println("invaild browser, Enter the correct browser name");
			}
			driver.manage().window().maximize();
			//implicitWait(10);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return driver;

	}

	public static void cLose() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void forward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void back() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void currentUrl() {
		try {
			System.out.println(driver.getCurrentUrl());
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static String pageTitle() {
		
		return driver.getTitle();

	}

	public static void get(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void getText(WebElement text) {
		try {
			System.out.println(text.getText());
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}
	
	public static void clear(WebElement element) {
		try {
			element.clear();
		}catch(Exception e){
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void getAttribute(WebElement element, String attributeName) {
		try {
			System.out.println(element.getAttribute(attributeName));
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	// Alert

	public static void simpleAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void confirmAlert(String condition) {
		try {
			if (condition.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (condition.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			} else {
				System.out.println("Invalid name, Enter the correct name");
			}
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void promptAlert(String input) {
		try {
			Alert promptAlert = driver.switchTo().alert();
			promptAlert.sendKeys(input);
			promptAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	// Actions

	public static void rightClick(WebElement element) {
		try {
			act = new Actions(driver);
			act.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void mouseOverClick(WebElement element1, WebElement element2) {
		try {
			act = new Actions(driver);
			act.moveToElement(element1).moveToElement(element2).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void dragAndDrop(WebElement element1, WebElement element2) {
		try {
			act = new Actions(driver);
			act.dragAndDrop(element1, element2).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void sendKeys(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	// Robot

	public static void keyPressRelease(int robotAction) {
		try {
			bot.keyPress(robotAction);
			bot.keyRelease(robotAction);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void frame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	public static void frame(String frameName) {
		try {
			driver.switchTo().frame(frameName);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void frame(int frameIndex) {
		try {
			driver.switchTo().frame(frameIndex);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void defaultFrame() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void windowHandles(int windowNumber) {
		try {
			Set<String> windows = driver.getWindowHandles();
			List<String> windowsList = new ArrayList(windows);
			driver.switchTo().window(windowsList.get(windowNumber));
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void implicitWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void dropdown(WebElement element, String value) {
		try {
			select = new Select(element);
			if (value.contains(element.getText())) {
				select.selectByVisibleText(value);
			} else {
				select.selectByValue(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void multipleDropDown(List<WebElement> element, String value) {
		try {
			List<WebElement> options = element;
			for (WebElement itr : options) {
				if (value.equalsIgnoreCase(itr.getText())) {
					itr.click();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void screenShot(String picName)  {
		try {
			snap = (TakesScreenshot) driver;
			File get = snap.getScreenshotAs(OutputType.FILE);
			File location = new File("C:\\Users\\hp\\eclipse-workspace\\UsingMaven\\screeenshot\\" + picName + ".png");
			FileUtils.copyFile(get, location);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

	public static void scrollElement(WebElement element) {
		try {
			scroll = (JavascriptExecutor) driver;
			scroll.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
	
	public static String excelValue(int sheetIndex,int rowindex,int coloumnIndex) {
		File f;
		FileInputStream fis;
		Workbook excel = null ;
		try {
			f = new File("C:\\Users\\hp\\eclipse-workspace\\CucumberFramework\\AcatinInputValues.xlsx");
			fis = new FileInputStream(f);
			excel = new XSSFWorkbook(fis);
			
		}catch(Exception e){
			e.printStackTrace();
			driver.quit();
		}
		
		return excel.getSheetAt(sheetIndex).getRow(rowindex).getCell(coloumnIndex).toString();
	}
	
	public static String propertyValue(String value) throws Exception {
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\CucumberFramework\\src\\test\\java\\com\\propertyfile\\handling\\InputValues.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(value);
		
	}
}
