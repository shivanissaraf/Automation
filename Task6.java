package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	/*
	 1. launch url = https://demo.guru99.com/test/guru99home/
	 2. click JMeter Meter made easy
	 3. verify Title and Url after successful message close the tab
	 4. get back to parent window
	 5. click on Guru 99
	
	 */
	

	String expUrl ="https://demo.guru99.com/test/guru99home/";
	String expTitle = "Demo Guru99 Page";
    WebDriver d;  
    
        
    
	public void task6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(3000);
		String parentId =d.getWindowHandle();
		JavascriptExecutor j = ((JavascriptExecutor)d);  // "JavascriptExecutor" is an Interface helps to execute javascript through selenium.
		j.executeScript("scroll(0, 2100)"); // "executescript ()" is an parameterized method of JavascriptExecutor 
	
		
		Thread.sleep(3000);

		d.switchTo().frame("a077aa5e");
		WebElement click = d.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		click.click();
		
		Thread.sleep(3000);

		d.switchTo().window(parentId);
		WebElement link =d.findElement(By.xpath("//img [@src= 'images/logo_1.png']"));				
		link.click();

		Thread.sleep(3000);
		d.quit();
				
			
		}


		
		
		
		
		
	
	








	public static void main(String [] args) throws InterruptedException {
		
		Task6 a = new Task6();
		a.task6();
		
		
		
	}
	
	

}
