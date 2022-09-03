package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAdvLoc {
	
	WebDriver d;
	public void ns() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Ffrom%3Dhz%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	Thread.sleep(5000);

	// 1. Absoulte Xpath By Index
	// Std Syntax - Tagname/Tagname/Tagname[Index]
	
	
	WebElement un = d.findElement(By.xpath("//html[1]/body/div/div/div[2]/div/div[2]/div/div/form/div/div/div/div/input")); //login
	un.sendKeys("");
	

	WebElement bt = d.findElement(By.xpath("//html/body/div/div/div[2]/div/div[2]/div/div/form[1]/div/div/div/div[2]/span"));
    bt.click();
    
    WebElement pw=  d.findElement (By.xpath ("//html/body/div/div/div[2]/div/div[2]/div/div/div/form/div/div/input"));
    pw.sendKeys(" ");
    

	WebElement s = d.findElement(By.xpath("//html/body/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input"));
    s.click();
    
	//2. Relative Xpath Normal/Regular  (// increases the security)
	// Std Syntax - //Tagname
	
	
	//WebElement un = d.findElement(By.xpath("//div/input")); //login
	//un.sendKeys("");
	
	//WebElement bt = d.findElement(By.xpath("//span"));
   // bt.click();
    
    
    // 3. Relative Xpath By Index
    // Std Syntax - //Tagname[Index] OR //Tagname/Tagname[Index]/Tagname
	
	/*
    WebElement un = d.findElement(By.xpath("//div/input[1]")); //login
	un.sendKeys("");
	
	WebElement bt = d.findElement(By.xpath("//span[1]"));
    bt.click();
    */
    

   // 4. Relative Xpath By Attribute // it is most used locator
   // Std Syntax - A)  //Tagname[@AttributeName ='AttributeValue'] B) //Tagname[@AttributeName ='AttributeValue'][Index]
	/*   
	
	WebElement em = d.findElement(By.xpath("//input[@name= 'email']"));	
    em.sendKeys("destiny4shivani@gmail.com");
    
    WebElement bt = d.findElement(By.xpath("//span[@id='continue']"));
    bt.click();
    */
	
	
	// 5. Relative Xpath By Text Function
	// Std Syntax - A)  //Tagname[text() ='TextValue'] B) //Tagname[text() ='TextValue'][Index]
	/*
	WebElement help =d.findElement(By.xpath("//a[text() ='Conditions of Use']"));
    help.click();  
    */
	
    
    // 6. Relative Xpath By Contains
    // Std Syntax For Attribute - //Tagname[contains(@attrubteName,'AttributeValue')]
    // Std Syntax For Link - //Tagname[contains(Text(),'TextValue')]
 
 //  WebElement help =d.findElement(By.xpath("//a[contains(text(), 'Conditions of Use')]"));
  //  help.click();
    
  
    
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		AmazonAdvLoc a = new AmazonAdvLoc ();
		
		
		a.ns();
		
		
	}
}
