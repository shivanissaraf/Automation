package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseAction {
	
	
	public void ns() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VelocityTraining\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://jqueryui.com/droppable/");
		JavascriptExecutor k = ((JavascriptExecutor)d); // scrolling
		k.executeScript("scroll(0, 100)");
		d.switchTo().frame(0);
		WebElement ele1 = d.findElement(By.xpath("//div[@id='draggable']")); // ele1 which we want to drag / source element
		WebElement ele2 = d.findElement(By.xpath("//div[@id='droppable']")); // ele2 where we want to drop / target element
		Actions a = new Actions(d);
		// a.clickAndHold(ele1).moveToElement(ele2).release().build().perform();  //   When we use more than one action in single script we have to build it and perform the action so for that we use "build().perform()"
		a.dragAndDrop(ele1, ele2).perform(); // Action class method dragAndDrop() is used to perform the opertaion 		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		
		k.executeScript("scroll(0, -100)");
		WebElement ele3 = d.findElement(By.xpath("//input[@class='ds-input']"));
		a.sendKeys(ele3, "Selenium").perform(); // sending keys to search box
		Thread.sleep(2000);
		
		WebElement ele4 = d.findElement(By.xpath("(//a[@title='jQuery UI'])[2]"));
		// a.click(ele4).perform(); // single click
		// a.doubleClick(ele4).perform();  // double click
		a.contextClick(ele4).perform();  // right click
		Thread.sleep(4000);
		
		d.quit();

		
	}

	public static void main(String[] args) throws InterruptedException {
		 DragAndDropMouseAction b = new  DragAndDropMouseAction();
		 b.ns();
		
	}
}
