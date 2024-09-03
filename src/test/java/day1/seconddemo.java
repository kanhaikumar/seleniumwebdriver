package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seconddemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://ybnuniversityresult.in/admin/signin.php");
	    // Test the login functionality with both fields empty.
	    
	    //leave the username filed empty
	    driver.findElement(By.id("textUserId")).sendKeys("");
	    
	    //leave password filed empty
	     driver.findElement(By.id("txtPass")).sendKeys("");
	    //click the login button
	     driver.findElement(By.xpath("//*[@id=\"ActionForm\"]/div[2]/label/input")).click();
	     String errorMessage = driver.findElement(By.id("error-message-id")).getText(); // Assuming there is an element to display the error
	        if (errorMessage.contains("Username and Password cannot be empty")) {
	            System.out.println("Test passed: Proper error message displayed.");
	        } else {
	            System.out.println("Test failed: Error message not displayed or incorrect.");
	        }
	     // Close the browser
	        driver.quit();
	}

}
