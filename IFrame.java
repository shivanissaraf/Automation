package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame  {
	WebDriver d;
	public void iframe() {
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\My Web Page.html");
		WebElement nm = d.findElement(By.name("UN"));
		nm.sendKeys("Shivani Sanjay Saraf");

		WebElement em = d.findElement(By.name("EM"));
		em.sendKeys("xyz@gmail.com");
		
		WebElement pw = d.findElement(By.name("PW"));
		pw.sendKeys("xyz@");
		
		/*here we are switching to frame (0)
		Indexing in frame starts with 0. We can switch to frame by using 4 types 
		1. Name 
		2. Id
		3. Index
		4. WebElement
		
		*/
		d.switchTo().frame("iframefb");
		WebElement age = d.findElement(By.xpath("//input[@id='123']"));
		age.sendKeys("20");
		
	}
	
	public static void main(String[] args) {
		
		IFrame a = new IFrame ();
		a.iframe();
		
	}
	
	
	
}

	