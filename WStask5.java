package companyWaySelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WStask5 {
	WebDriver d;
	public void task5() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		    d = new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().deleteAllCookies();
		    d.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		    
			String parentId = d.getWindowHandle();   // to get the parent window id 
			WebElement l1 =d.findElement(By.xpath("//a[@href='http://www.google.com']"));
			l1.click();
	        Thread.sleep(2000);

			d.switchTo().window(parentId);
			
		    WebElement l2 = d.findElement(By.xpath("//a[@href='http://www.facebook.com']"));
			l2.click();
	        Thread.sleep(2000);

			
			d.switchTo().window(parentId);


			WebElement l3 =d.findElement(By.xpath("//a[@href='http://www.yahoo.com']"));
			l3.click();
	        Thread.sleep(2000);

			
			d.switchTo().window(parentId);
			
		    WebElement l4 = d.findElement(By.xpath("(//a[@href='http://www.facebook.com'])[2]"));
			l4.click();
	        Thread.sleep(3000);

			
			d.navigate().back();
			
	        Thread.sleep(3000);

	      
			Set<String> parentChildIds = d.getWindowHandles();  // here by using  getWindowHandles(); we will  get ids of parent and child window
			System.out.println("Parent and Child Window Ids are = "+ parentChildIds);   
            d.quit();
 
             
			



	}

}
