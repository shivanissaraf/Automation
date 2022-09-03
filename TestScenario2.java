package companyWaySelenium;

public class TestScenario2 extends LaunchingBrowsers{
	
	public void verifyUrl() { 
		
		String expUrl ="https://www.facebook.com/signup";
		String actUrl = d.getCurrentUrl(); // get current page url by using d.getCurrentUrl();
		
		if(expUrl.equals(actUrl)){  // condition to check expected url vs actual url.
			System.out.println("Test Scenario 2 passed and Actual url is = "  + actUrl );
		}
		else {
			System.out.println("Test Scenario 1 Failed and Actualurl is =" + actUrl);
		}
		
	}
	
	public static void main(String[] args) {
		TestScenario2 obj = new TestScenario2();
		obj.welcomeinSelenium();  // incomplete method from Interface
		obj.launchChromeBrowser(); // launching chrome browser
		obj.verifyUrl(); // method of current class 
		CommonProperties.tyFromSelenium();  // static method from Interface which is implemented by CommenProperties class that's why we have called it with [ CommonProperties.tyFromSelenium(); ] 
		d.close();  // closes the browser
		
		
	}


}


