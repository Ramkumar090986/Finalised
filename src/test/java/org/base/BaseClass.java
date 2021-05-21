package org.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maxiWindow() {
		driver.manage().window().maximize();

	}

	public static void click(WebElement ele) {
		ele.click();

	}

	public static void fill(WebElement ele, String text) {
		ele.sendKeys(text);

	}



	public static void applyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();

	}
	public static void takeSnap(String picName) throws IOException
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\eclipse-workspace\\FacebookCucumber\\Screenshots\\"+picName+".png");
		FileUtils.copyFile(src, dest);
	}
}
