package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterHandling {
	
	WebDriver d;
	public void alert() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://demoqa.com/alerts");
	d.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(3000);
	// Handling  Alert Popup using alerts by switching the focus of selenium from Main Page to Alert Popup
	//Alert is abstract class which have alert() method.
	//We have Alert interface, Alert class, Alert abstract class but here we are using Alert abstract class which implements the Alert interface
	d.switchTo().alert().accept(); //accept is used for ok. //simple alert
	
	//JavascriptExecutor a = ((JavascriptExecutor)d); 
	//a.executeScript("Scroll(0, 100)");
	d.findElement(By.xpath("//button[@id='confirmButton']")).click();
	d.switchTo().alert().dismiss(); //dismiss is used for cancel 
	
	
    WebElement ia=	d.findElement(By.xpath("//button[@id='promtButton']"));
    ia.click();
    
    d.switchTo().alert().sendKeys("vchcjdh"); // Prompt alert

    d.switchTo().alert().accept();
    
	Thread.sleep(3000);
    
    ia.click();
    
    String AlertText = d.switchTo().alert().getText();  // getText() used to get the text of alert
    System.out.println("Text on Alert is = " + AlertText);

    d.switchTo().alert().accept();
	Thread.sleep(2000);
	d.quit();
	
	
	

	}
	
	public static void main(String[] args) throws InterruptedException {
		AlterHandling a = new AlterHandling();
		a.alert();
		
	}

}

