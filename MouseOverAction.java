package companyWaySelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	
	
	public void moa() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
        // "navigate().to()" is used to hit the url as well as open another link/page
        d.navigate().to("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement bt = d.findElement(By.xpath("//button[@class='dropbtn']"));
		Actions a = new Actions(d); // Action is class 
		a.moveToElement(bt).perform();  /*  - moveToElement() is an Action class method. This method is used to move source element to location of targeted element
	- Action class perform() method is used to perform single action on element like single click.
	*/
		List<WebElement> elements = d.findElements(By.xpath("//div[@class='dropdown-content']/a"));   // When we have list of webelement at that time we use it. we have used d.findElements here because we are finding more than one element.
        int count = elements.size(); // to get the size of our element 
		System.out.println("count of element =" + count);
		
		for(int i=0; i<count; i++) {
			
			WebElement f = elements.get(i);
			String text = f.getAttribute("innerHTML"); /* Here we are getting text of hidden html element by using getAttribute("innerHTML");  and we are storing it  in "text".*/
			System.out.println(text);//printing text 
			if(text.equals("Appium")) {  // condition if text = appium then click on it.
				f.click();			  
			}
		
		}
		
		Thread.sleep(3000);	
        d.quit();
	
	
	}

	public static void main(String[] args) throws InterruptedException {
		MouseOverAction obj = new MouseOverAction();
		obj.moa();
		
	}
}
