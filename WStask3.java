package companyWaySelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WStask3 {

	WebDriver d;
	public void task3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String parentId = d.getWindowHandle();   /// to get the parent window id 
		System.out.println("Parent Window Id is = "+parentId);
		
		WebElement l3 =d.findElement(By.xpath("//a[@href='http://www.yahoo.com']"));
		l3.click();
		
		Set<String> parentChildIds = d.getWindowHandles();
		
		
		
		for (String ch: parentChildIds ) {
			
			if(!parentId.equals(ch)) {
				
				d.switchTo().window(ch);
				Thread.sleep(3000);
				WebElement search = d.findElement(By.xpath("//input[@class='sbq']"));
				search.sendKeys("bts images");
				Thread.sleep(3000);
				
				WebElement searchBt = d.findElement(By.xpath("//div[@class='mag-glass']"));
				searchBt.click();
				Thread.sleep(3000);
				
				d.close();
				

				
				
			}
			
		}
		
		
		d.switchTo().window(parentId);
		Thread.sleep(3000);
        WebElement y = d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2019/']"));
        y.click();
        Thread.sleep(3000);
        d.quit();
		
	}

}
