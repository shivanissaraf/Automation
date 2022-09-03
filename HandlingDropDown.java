package companyWaySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
	public void dropdown() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\VelocityTraining\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.facebook.com/signup");
		WebElement day = d.findElement(By.xpath("//select[@id='day']")); // Search WebElement which we want to select
        Select d1 = new Select(day);  // Select is class and it have parameterized constructor
        d1.selectByIndex(10);  // Indexing starts from 0, so for selecting 11 we have to give 10 as Index. 
		
        WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		Select d2 = new Select(month);
		d2.selectByValue("4"); // Selecting option by its value.
		
		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		Select d3 = new Select(year);
		d3.selectByVisibleText("1996");
		
		List <WebElement> options = d3.getOptions(); //List is from collection // List <WebElement> is used when we are getting multiple elements. 
		//getOptions(); we get the options from drop down element
		
        int count = options.size(); // option.size(); by using this we get the count of options
		System.out.println("Total Years Present are = "+count); // printing count of options


		for(int i = 0; i<count; i++) {      // for loop will iterate till i is less than count
			String text = options.get(i).getText(); //here saving options in "String text" . options.get(i).getText(); by using this we will get options and its text.
			System.out.println(text); // Printing stmt will give us Options and its text
		}

		Thread.sleep(3000);
		d.quit();
	}

	public static void main (String[] args) throws InterruptedException {
		
		HandlingDropDown  a = new HandlingDropDown ();
		a.dropdown();
		
	}
		
	}


