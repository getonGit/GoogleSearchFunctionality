package stepdef;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

	//create an object on WebDriver class
	WebDriver WD1;
	//Declare String variable to store the web URL
	String baseURL;
	//Declare string used to search on google search bar
	String String1;
			
	@Given("^User is on the Google home page$")
public void user_is_on_the_Google_home_page(){
		//Get the path below where Chrome driver application is located and configure 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilpamadhuri_r\\Documents\\chromedriver.exe");
		
		//initialize the web driver browser to point to chrome
		WD1 = new ChromeDriver();
		
		//store the link to the website in the baseURL variable
		baseURL = "https://www.google.com/";
		
		//maximize the window 
		WD1.manage().window().maximize();
		
		//open the web url
		WD1.get(baseURL);
		
		//wait for 1second
		WD1.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    
	}

@When("^User types a String into the search field$")
public void user_types_a_String_into_the_search_field()  {
		//initialize string to be used in google search
		String1 = "best place to work in europe";
					
		//locate the search bar by xpath
		WD1.findElement(By.xpath("//input[@name='q']")).click();
		
		//provide keys to search
		WD1.findElement(By.xpath("//input[@name='q']")).sendKeys(String1);
	    
	}

	
@And("^User clicks the Enter key on the keyboard$")
public void user_clicks_the_Enter_key_on_the_keyboard()  {
		//use the ENTER key on keyboard to start finding the test results
	    WD1.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	    
	}


@Then("^User is able to see search results and quits$")
public void user_is_able_to_see_search_results_and_quits() {
		WD1.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		System.out.println("the result pages related to the string:" + String1 + " are displayed");
		//Quit the driver
		System.out.println("quitting browser for scenario 1");
	     WD1.quit();
	   
	}
@When("^User types an invalid String into the search field$")
public void user_types_an_invalid_String_into_the_search_field()  {
	//initialize string to be used in google search
			String1 = "$$$$$$$$$$$$$$$$$$$$$$$";
						
			//locate the search bar by xpath
			WD1.findElement(By.xpath("//input[@name='q']")).click();
			
			//provide keys to search
			WD1.findElement(By.xpath("//input[@name='q']")).sendKeys(String1);
   
}

@Then("^User is not able to see any test results and quits the browser$")
public void user_is_not_able_to_see_any_test_results_and_quits_the_browser()  {
	 WD1.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
     System.out.println("No results displayed for invalid String: " + String1);
     //Quit the driver
     System.out.println("quitting browser for scenario 2");
     WD1.quit();
     

}
}


