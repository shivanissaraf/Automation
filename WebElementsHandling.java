package companyWaySelenium;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementsHandling {
	WebDriver d;
	public void task1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.naukri.com/");
		String parentId = d.getWindowHandle();   // to get the parent window id 
		System.out.println("Parent Window Id is = "+parentId);
		WebElement reg = d.findElement(By.xpath("//a [@title ='Jobseeker Register']")); // new window opens
		reg.click();
		
		Set<String> parentChildIds = d.getWindowHandles();  // here by using  getWindowHandles(); we will  get ids of parent and child window
		System.out.println("Parent and Child Window Ids are = "+ parentChildIds);   

		for(String ch: parentChildIds ) {  // searching for child window id to fill details


			
			if (!parentId.equals (ch)) {  // if stmt is used to compare ids and search for child id to fill details

				
				d.switchTo().window(ch);  // switch to child window/tab
				Thread.sleep(3000);
				WebElement nm = d.findElement(By.xpath("//input[@id='name']"));
				nm.sendKeys("Shivani Sanjay Saraf");
				
				WebElement em = d.findElement(By.xpath("//input[@id='email']"));
				em.sendKeys("d@gmail.com");
				
				Thread.sleep(2000);
				d.close();
				
				
			}
			
		}
		
		d.switchTo().window(parentId);
		WebElement skill = d.findElement(By.xpath("//input[@class= 'suggestor-input ']"));
		skill.sendKeys("Software Testing");
		
		WebElement city = d.findElement(By.xpath("(//input[@class= 'suggestor-input '])[2]"));
		city.sendKeys("Pune");
		
		WebElement bt = d.findElement(By.xpath("//div[@class='qsbSubmit']"));
		bt.click();
		
		Thread.sleep(3000);
		d.quit();
	}

}
