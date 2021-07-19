package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	
WebDriver driver;
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	   
	}
	@When("user enters valid username  {string}")
	public void user_enters_valid_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement userName =  driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
	   userName.sendKeys(username);
	}
	    
	@When("User enters valid password {string}")
	public void user_enters_valid_password(String password) {
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
	
	}
	@When("User clicks on button submit")
	public void user_clicks_on_button_submit() {
	    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
	}
	@Then("User should see username as {string}")
	public void user_should_see_username_as(String expectedUsername) {
	    
		String actual = driver.findElement(By.xpath("//*[@id=\"welcome\"]")).getText();
	    
		Assert.assertEquals(actual, expectedUsername);
		driver.close();
	}



}
