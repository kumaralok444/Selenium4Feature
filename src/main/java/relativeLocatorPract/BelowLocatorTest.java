package relativeLocatorPract;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BelowLocatorTest {
private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void tc1() {
		driver.get("https://accounts.lambdatest.com/login");
		WebElement we=driver.findElement(By.cssSelector(".orsignup"));
		WebElement userBox=driver.findElement(withTagName("input").below(we));
		userBox.sendKeys("user-name");
		WebElement passwdBox=driver.findElement(withTagName("input").below(userBox));
		passwdBox.sendKeys("password");
		driver.findElement(withTagName("button").below(passwdBox)).click();
		
	}
	

}
