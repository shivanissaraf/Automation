package companyWaySelenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LiveFrameHandling {
	

	String expUrl ="https://demo.guru99.com/test/guru99home/";
	String expTitle = "Demo Guru99 Page";
    WebDriver d;  
    
        
    
	public void task() throws InterruptedException, IOException {
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
		d.switchTo().defaultContent();

		Set<String> parentChildId = d.getWindowHandles();
		System.out.println("ParentChildhildID is"+ parentChildId );
		
		
		for(String ch: parentChildId) {
		   if(!parentId.equals(ch)) {
			   System.out.println("Switch the focus of selenium from main page to child page");
			   d.switchTo().window(ch);
			   Thread.sleep(2000);
				String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\Selenium\\defect3.png";
				WebElement element = d.findElement(By.xpath("//img[@width='300'and@height='78'and@alt='Guru99']"));
				File Source = element.getScreenshotAs(OutputType.FILE);
				File dest = new File(path);
				FileHandler.copy(Source, dest);
				d.close();
			   
			   
			   
		    }
		}
		d.switchTo().window(parentId);
		String path1 = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\Selenium\\defect4.png";
		WebElement element1 = d.findElement(By.xpath("//img[@src='../img/logo.png']"));
		File Source1 = element1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File (path1);   // setting destination path where we want to copy our ss.
		FileHandler.copy(Source1, dest1);
		d.quit();

    }
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		LiveFrameHandling a = new LiveFrameHandling();
		a.task();
		
	}
}
