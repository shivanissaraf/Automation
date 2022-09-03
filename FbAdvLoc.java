package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbAdvLoc {

	WebDriver d;
	public void ns() {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://www.facebook.com/login.php");
	
	//Advance Locators

	// 1. Absoulte Xpath By Index
	// Std Syntax - Tagname/Tagname/Tagname[Index]
	
	/*
	WebElement un = d.findElement(By.xpath("html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input")); //login
	un.sendKeys("d@gmail.com");
	
	WebElement pw = d.findElement(By.xpath("html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input"));  //pwd
	pw.sendKeys("");
	
	WebElement bt = d.findElement(By.xpath("html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/button"));
    bt.click();
	
    */
  
	
	

	//2. Relative Xpath Normal/Regular  (// increases the security)
	// Std Syntax - //Tagname
	   
	/*
	    WebElement un = d.findElement(By.xpath("//form/div/div/input")); //login
		un.sendKeys("d@gmail.com");
		
		WebElement pw = d.findElement(By.xpath("//form/div/div/div/div/input"));  //pwd
		pw.sendKeys("m");
		
		WebElement bt = d.findElement(By.xpath("//button"));
	    bt.click();
	    
	    */
		
	    
	 // 3. Relative Xpath By Index
    // Std Syntax - //Tagname[Index] OR //Tagname/Tagname[Index]/Tagname
	/*
	    WebElement un = d.findElement(By.xpath("//form/div[1]/div[1]/input")); //login
		un.sendKeys("d");
		
		WebElement pw = d.findElement(By.xpath(" //form/div[1]/div[2]/div[1]/div[1]/input"));  //pwd
		pw.sendKeys("m");
		
		WebElement bt = d.findElement(By.xpath("//button[1]"));
	    bt.click();
	    
	   */
	

	   // 4. Relative Xpath By Attribute // it is most used locator
	   // Std Syntax - A)  //Tagname[@AttributeName ='AttributeValue'] B) //Tagname[@AttributeName ='AttributeValue'][Index]
	   
	/*
    WebElement em = d.findElement(By.xpath("//input[@name= 'email']"));	
    em.sendKeys("d@gmail.com");
		
    WebElement pw =d.findElement(By.xpath("//input[@name='pass']"));
    pw.sendKeys("ma");
	
	WebElement bt = d.findElement(By.xpath("//button[@name='login']"));
    bt.click();
    */
    
    
	// 5. Relative Xpath By Text Function
	// Std Syntax - A)  //Tagname[text() ='TextValue'] B) //Tagname[text() ='TextValue'][Index]
    
	/*
	WebElement fpw =d.findElement(By.xpath("//a[text() ='Forgotten account?']"));
    fpw.click();
   */
    
    
    
    // 6. Relative Xpath By Contains
    // Std Syntax For Attribute - //Tagname[contains(@attrubteName,'AttributeValue')]
    // Std Syntax For Link - //Tagname[contains(Text(),'TextValue')]
 
    //WebElement link1 = d.findElement(By.xpath("//a[contains (@href, 'r.php?locale=en_GB&display=page')]"));    //Attribute
    //link1.click();
    
    WebElement fpw =d.findElement(By.xpath("//a[contains (text(), 'Forgotten account?')]"));
    fpw.click();

    
		
	}
	
	public static void main(String [] args) {
		
		FbAdvLoc obj = new FbAdvLoc();
		obj.ns();
		
	}
}
