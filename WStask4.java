package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WStask4 {
	
	WebDriver d;
	public void task4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	    d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().deleteAllCookies();
	    d.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	    
	    
	    WebElement l4 = d.findElement(By.xpath("(//a[@href='http://www.facebook.com'])[2]"));
	    l4.click();
		
		Thread.sleep(3000);
		
        d.navigate().back();
        Thread.sleep(2000);
		d.quit();


		
	}

}
