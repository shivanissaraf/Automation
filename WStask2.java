package companyWaySelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WStask2 {
	
	WebDriver d;
	
	public void task2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	    d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().deleteAllCookies();
	    d.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	    
	    String parentId = d.getWindowHandle();
	    
	    WebElement l2 = d.findElement(By.xpath("//a[@href='http://www.facebook.com']"));
	    l2.click();
	    
	    Set<String> parentChildIds = d.getWindowHandles();
	    
	    
	    for(String ch : parentChildIds) {
	    	if (!parentId.equals(ch)) {
	    		d.switchTo().window(ch);
	    		Thread.sleep(3000);
	    		WebElement un = d.findElement(By.xpath("//input[@name='email']"));
	    		un.sendKeys("i@gmail.com");
	    	    Thread.sleep(2000);

	    		WebElement pw = d.findElement(By.xpath("//input[@name='pass']"));
	    		pw.sendKeys("i@gmail.com");

	    		WebElement bt = d.findElement(By.xpath("//button[@name='login']"));
	    		bt.click();
	    	    Thread.sleep(3000);

	    		d.close();
	    		
	    	}
	    	
	    }
	    
	    d.switchTo().window(parentId);
		Thread.sleep(3000);
        WebElement y = d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2021/']"));
        y.click();
        Thread.sleep(5000);
	    	  

	    d.quit();
	    
	    
	    
	}
	
public static void main(String[] args) throws InterruptedException {
		
		
		
	   WStask2 b = new WStask2();
		b.task2();
	}

}
