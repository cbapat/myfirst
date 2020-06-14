package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver","C:\\ProgramData\\Oracle\\Java\\javapath\\chromedriver.exe");
	
	//WebDriver driver = StepDifination.Global.driver;
	//

public SmokeTest(){
	System.setProperty("webdriver.chrome.driver","C:\\ProgramData\\Oracle\\Java\\javapath\\chromedriver.exe");
		
	   driver = new ChromeDriver();
	   //driver= new WebDriver();
}



@Given("Open Chrome and start app$")
public void open_Chrome_and_start_app( ) throws Throwable {
//FirefoxOptions options123 = new FirefoxOptions();
//options123.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//driver = new FirefoxDriver(options123);
	//DesiredCapabilities capabilities = DesiredCapabilities.firefox();

	// Tell the Java bindings to use Marionette.
	// This will not be necessary in the future,
	// when Selenium will auto-detect what remote end
	// it is talking to.
	//capabilities.setCapability("marionette", true);

	//WebDriver driver = new RemoteWebDriver(capabilities); 

  //  System.setProperty("webdriver.gecko.driver","C:\\Users\\bapauchi\\Downloads\\geckodriver.exe");
	
	//WebDriver driver = new FirefoxDriver();
	
	
	//WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	
	
    // Write code here that turns the phrase above into concrete actions
	
	
    
}



@When("^\"([^\"]*)\" and \"([^\"]*)\" is entered$")
public void and_is_entered(String string1, String string2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.id("email")).sendKeys(string1);

	
	driver.findElement(By.id("pass")).sendKeys(string2);
	
    //throw new cucumber.api.PendingException();
}





/*@When("UserID and Password is entered$")
public void userid_and_Password_in_entered() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try {
	Thread.sleep(5000);
	System.out.println("Inside UID & Pass");
	
	driver.findElement(By.id("email")).sendKeys("chintamani.bapat@gmail.com");
	//driver.findElements(by.)
//	driver.findElement(ById("email")).sendKeys("chintamani.bapat@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("Selenum123$");
	
} catch (Exception e) {
    e.printStackTrace();
}

	
	
    
}*/

@Then("User should be able to login$")
public void user_should_be_able_to_login () throws Throwable{
    // Write code here that turns the phrase above into concrete actions
	
	
	driver.findElement(By.id("loginbutton")).click();
	driver.quit();
}


}
