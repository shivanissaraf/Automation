package companyWaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizingOfBrowser {
	
	static WebDriver d;
	
	
	/*Test Scenarios
	 
	1. Check whether url is working or not.
	
	2. Check whether we are able to minimize the web page or not.
	
	3. After minimizing check whether we are able to click on web element or not.
	
	4. Check the behavior of our web page whether it is stable or not (check it is working same as maximize size or not)
	
	5. Click on input and fill the details and check whether we are able to fill it or not.
	
	6. After filling input then click on submit button, and check whether it is working or not. 
	
	7. After login check whether  the home page is visible or not.
	
	8. Check the other tabs on home page are working fine or not.
		

	*/
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		//d.get("https://www.facebook.com/login.php");
		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Ffrom%3Dhz%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		
	//	Dimension size = d.manage().window().getSize();
	//	System.out.println("Height =" +size.getHeight() +  "/n"  + "Width =" +size.getWidth());  // shows height and width of window
		
		
		
		
		Dimension s = new Dimension(300, 600);   //size
		d.manage().window().setSize(s);
		
	    Thread.sleep(3000);
		//Point pp =d.manage().window().getPosition();
		//System.out.println("X- axis =" + pp.getX()  + "Y- axis =" + pp.getY());   // shows X and y axis position of Window.
		
		
		Point p = new Point(600,500);  //postion 
		d.manage().window().setPosition(p);
		Thread.sleep(3000);

		d.manage().window().fullscreen();

		
		
		WebElement un = d.findElement(By.xpath("//html[1]/body/div/div/div[2]/div/div[2]/div/div/form/div/div/div/div/input")); //login
		un.sendKeys("destiny4shivani@gmail.com");
		

		WebElement bt = d.findElement(By.xpath("//html/body/div/div/div[2]/div/div[2]/div/div/form[1]/div/div/div/div[2]/span"));
	    bt.click();
	    
	    WebElement pw=  d.findElement (By.xpath ("//html/body/div/div/div[2]/div/div[2]/div/div/div/form/div/div/input"));
	    pw.sendKeys("taramati445");
	    

		WebElement s1 = d.findElement(By.xpath("//html/body/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input"));
	    s1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement un = d.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("destiny4shivani@gmail.com");
		

		WebElement pw = d.findElement(By.xpath("//input[@name= 'pass']"));
		pw.sendKeys("maseera1104");
		
		
		WebElement bt = d.findElement(By.xpath("//button[@name='login']"));
		bt.click();
		*/
		
	}
	
	

	

}
