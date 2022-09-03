package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaAdvLoc {
	WebDriver d;
	public void ns() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.instagram.com/?hl=en");
		
		//WebElement un = d.findElement(By.xpath("/html/body/div[2]/section/main/article/div[2]/div/div[2]/form/div/div/div/label/span/input[1]"));
		//un.sendKeys("s");
		
		Thread.sleep(3000);
		WebElement un = d.findElement(By.name("username"));
		

		//WebElement un = d.findElement(By.xpath("//label[1]/input[2]"));
		un.sendKeys("s");
		
		
       WebElement pw = d.findElement(By.name("password"));
       pw.sendKeys("");
       
       
       WebElement bt = d.findElement(By.xpath("//button[2]" ));	
       bt.click();
	}

	
	
	public static void main(String[] args) throws InterruptedException {
		
		InstaAdvLoc a = new InstaAdvLoc ();

		a.ns();
		
	}	
}
