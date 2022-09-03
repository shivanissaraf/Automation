package companyWaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	
	public void ns() throws InterruptedException {
		//Set proterty
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize(); // We used to work on  selenium version 3.141.59 We had user story in that we have asked to use updated selenium version 4. In that version we have new method minimize(), with the help of this method we can minimize our browser.
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/signup"); // we navigate to this page/ link/ url. Opens it then close it and open 2nd url in same tab         // "navigate().to()" is used to hit the url as well as open another link/page

		Thread.sleep(3000); //static argumented method. When we use this method browser stops for 3sec, its an error/exception so at that time thread class will handle this exception. It throws Interreputed Exception.
		driver.navigate().to("https://www.instagram.com/");// close the 1st url and opens this 2nd url in same tab.
		Thread.sleep(3000);// we will need to write throws InterruptedException in non static method and main method as well.
		driver.navigate().back();// get back to 1st url
		Thread.sleep(3000);
		driver.navigate().forward(); // 2nd url opens.
		Thread.sleep(3000);
		driver.navigate().refresh(); //refresh that page.
		Thread.sleep(3000);
		driver.close(); // closes the tab/ browser.
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		NavigateMethods obj = new NavigateMethods();
		obj.ns();
	}

}
