package companyWaySelenium;

public class TestScenario1 extends LaunchingBrowsers {
	
	// TestScenario1 - Verify the title of Facebook Application Matching with expected title
	// Validate the expected title is matching with actual title of FB App.
	// To check whether Actual Title is Matching with Expected Title
		
	 // Test Cases --
		// Step 1 - End user launches the browser successfully
		// Step 2 - End user hits valid URL of FB Application
		// Step 3 - End user sees 'SignUp' page
		// Step 4 - End user Validated Actual Title is matched with Expected title or not.
	
	String expTitle = "Sign up for Facebook | Facebook";
	
	public void verifyTitle() {
		String actTitle = d.getTitle(); // get current page title
		//d.getCurrentUrl();
		
		if(expTitle.equals(actTitle)){  // condition to check expected title vs actual title.
			System.out.println("Test Scenario 1 passed and Actual Title is = "  + actTitle );
		}
		else {
			System.out.println("Test Scenario 1 Failed and Actual Title is =" + actTitle);
		}
		
	}
	
	public static void main(String[] args) {
		TestScenario1 obj = new TestScenario1();
		obj.welcomeinSelenium();  // incomplete method from Interface
		obj.launchChromeBrowser(); // launching chrome browser
		obj.verifyTitle();  
		CommonProperties.tyFromSelenium();  // static method from Interface which is implemented by launching browser class that's why we have called it with [ CommonProperties.tyFromSelenium(); ] 
		d.close();  // closes the browser
		
		
	}


}






