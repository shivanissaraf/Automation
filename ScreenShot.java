package companyWaySelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	WebDriver d;
	public void ss() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://demo.guru99.com/test/guru99home/");
	
	// To Take ScreenShot we Need 1. Path Where we want to store ScrrenShot 

	String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\Selenium\\defect1.png";
	
	//File is class
	File defect1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE); // (OutputType.FILE) is use because we want ss as file
	//Takes ss of entire page but we can see only html body in ss due to security reasons
	File f = new File(path);  //File handling because Selenium works on Web Browser only, we cannot goto path directly
	FileHandler.copy(defect1, f); // FileHandler class copy method()
	Thread.sleep(2000);
	
	String path1 = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\Selenium\\defect2.png";
	WebElement element = d.findElement(By.xpath("//img[@src='images/logo_1.png']"));
	File a = element.getScreenshotAs(OutputType.FILE);  // ss of specific element
	File b = new File(path1);
	FileHandler.copy(a, b);
	Thread.sleep(2000);

	
	
	String path2 = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\Selenium\\defect8.png";
	WebElement element1 = d.findElement(By.xpath("//img[@src='images/logo_funlearn.png']"));
	File c = element1.getScreenshotAs(OutputType.FILE);  // ss of specific element
	File e = new File(path2);
	FileHandler.copy(c, e);
	Thread.sleep(2000);
	
	d.quit();
	
	
	
	
	}

	public static void main (String[] args) throws InterruptedException, IOException {
		ScreenShot c = new ScreenShot();
		c.ss();
		
	}
}
