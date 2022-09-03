package companyWaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSenario3 {
	//new tab and new window. New feature from selenium 4
	
	public void newTab_NewWindow() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB); // new tab opens
		newTab.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		//driver.close();
		driver.get("https://www.ixigo.com/flights");
		Thread.sleep(3000);
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW); // new window opens
		newWindow.navigate().to("https://paytm.com/recharge");	
		Thread.sleep(3000);
		driver.close();
	}
		
		public static void main(String[] args) throws InterruptedException {
			
			TestSenario3 obj = new TestSenario3   ();
			obj.newTab_NewWindow(); 
			
		}
		
		
		
		
	

}
