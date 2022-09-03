package companyWaySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTask2 {
	WebDriver d;
	public void login () throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\setups\\ChromeWebdriver101_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Ffrom%3Dhz%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\TestData.xlsx";
		FileInputStream f = new FileInputStream (path);
		String un = WorkbookFactory.create(f).getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
		
		
		FileInputStream f1 = new FileInputStream (path);
		String pw = WorkbookFactory.create(f1).getSheet("sheet2").getRow(0).getCell(1).getStringCellValue();

		WebElement unsername = d.findElement(By.xpath("//div/input")); //login
		unsername.sendKeys(un);
		
		WebElement bt = d.findElement(By.xpath("//span"));
		bt.click();
		 
		
		WebElement pwd = d.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys(pw);
		
		WebElement bt1 = d.findElement(By.xpath("//input[@id='signInSubmit']"));
		bt1.click();
		
		
		//WebElement signout = d.findElement(By.xpath("//a[@id='nav-item-signout']"));
		//signout.click();
		Thread.sleep(5000);
		
		d.quit();
		 
	}
	public static void main(String [] args) throws EncryptedDocumentException, IOException, InterruptedException {
		ExcelTask2 a = new ExcelTask2();
		a.login ();
	}
}
