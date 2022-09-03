package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	WebDriver d;
	
	public void ns() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.facebook.com/login.php");
		WebElement Email = d.findElement(By.xpath("//html/body/div/div[2]/div/div/div[2]/div[2]/form/div/div"));
		Email.sendKeys("d@gmail.com");
		
		WebElement pass = d.findElement(By.name("pass"));
		pass.sendKeys("4");
		
		WebElement login = d.findElement(By.name("login"));
		login.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String [] args) {
		Facebook obj = new Facebook ();
		obj. ns();
		
	}

}
