package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignUpSteps {
     public WebDriver driver;
     
	@Given("^User is on Application Home Page$")
	public void user_is_on_application_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver",
	    		System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.phptravels.net/home");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	}

	@When("^Application Page Title is PHP Travels$")
	public void application_page_title_is_php_travels() {
	 String actualTitle=driver.getTitle();
	 String expectedTitle="PHPTRAVELS - PHPTRAVELS";
	Assert.assertEquals(actualTitle,expectedTitle);
	}

	@Then("^User clicks on Sign Up option$")
	public void user_clicks_on_sign_up_option() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/a[1]")).click();
	  
	}

	@When("^User navigate to Sign Up page$")
	public void user_navigate_to_sign_up_page() {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle=driver.getTitle();
		 String expectedTitle="Signup - PHPTRAVELS";
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	@Then("User enters the details and details are validated")
	public void user_enters_the_details_and_details_are_validated(DataTable details) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<String> data=details.asList();
	    driver.findElement(By.name("first_name")).sendKeys(data.get(0));
	    driver.findElement(By.name("last_name")).sendKeys(data.get(1));
	    driver.findElement(By.name("phone")).sendKeys(data.get(2));
	    driver.findElement(By.name("email")).sendKeys(data.get(3));
	    driver.findElement(By.name("password")).sendKeys(data.get(4));
	    
	   String fname= driver.findElement(By.name("first_name")).getAttribute("value");
	   String lname= driver.findElement(By.name("last_name")).getAttribute("value");
	   String phoneNo= driver.findElement(By.name("phone")).getAttribute("value");
	   String emailID= driver.findElement(By.name("email")).getAttribute("value");
	   String pwd= driver.findElement(By.name("password")).getAttribute("value");
	    
	   Assert.assertEquals(fname,data.get(0));
	   Assert.assertEquals(lname,data.get(1));
	   Assert.assertEquals(phoneNo,data.get(2));
	   Assert.assertEquals(emailID,data.get(3));
	   Assert.assertEquals(pwd,data.get(4)); 
	}


	@Then("^click on Sign Up button$")
	public void click_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement signupBtn= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[7]/button/span[1]"));
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();",signupBtn );
	}
	@Then("^Close the Browser$")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}
}
