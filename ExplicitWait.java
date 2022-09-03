package companyWaySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
 WebDriver d;
 
 public void ns() throws InterruptedException {
	 // Explicit Wait = Waiting time + Condition
	 System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		//Creating Object
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10)); //  This wait will apply on specific WebElement which  have weird behavior.
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://paytm.com/recharge");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Implicit Wait applied on whole page
		// 2. Expected Condition
				WebElement education; // webElement var created for element where we want to give ExplicitWait.
				education = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/education']")));
				education.click();
				Thread.sleep(2000);
				d.quit();

	 
	 
	 
 }
 
 public static void main(String[] args) throws InterruptedException {
	 
	 ExplicitWait a = new ExplicitWait();
	 a.ns();
	 
 }
}
