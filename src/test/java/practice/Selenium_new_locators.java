package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
public class Selenium_new_locators {

	public static void main(String[] args) {
       //set up the webdriver and navigate login page
		WebDriver driver= new ChromeDriver();
		driver.get("https://sunriseuniversityresult.in/admin/signin.php");
		
		//locate the username field ,which is above the password field
		WebElement passwordField=driver.findElement(By.id("password"));
		WebElement userIdField=driver.findElement(with(By.tagName("input")).above(passwordField));
		userIdField.sendKeys("SuperStar@13#sunrise");
		
		//locate the password field which is below the username field
		WebElement passwordFieldBelow=driver.findElement(with(By.tagName("input")).below(userIdField));
		passwordFieldBelow.sendKeys("SuperStar@13#sunrise");
		
		
	}

}
