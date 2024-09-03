package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sqlinjuction {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://ybnuniversityresult.in/admin/signin.php");
	    String sqlInjection = "' OR '1'='1";
	    driver.findElement(By.id("txtUserId")).sendKeys(sqlInjection);
	    driver.findElement(By.id("textPass")).sendKeys(sqlInjection);
	    driver.findElement(By.xpath("//*[@id=\"ActionForm\"]/div[2]/label/input")).click();
	    boolean loginSuccess=false;
	    try {
	    	loginSuccess=driver.findElement(By.id("success-element-id")).isDisplayed();
	    	}
	    catch (Exception e)
	    {
	    	loginSuccess=false;
	    }
	    if(!loginSuccess)
	    {
	    	System.out.println("test passed:sql injuction was not successful.");
	    }
	    else
	    {
	    	System.out.println("Test failed: Sql injection was successful.");
	    }
	    
	    //optional: validate that an error message is dispalyed
	    try {
            String errorMessage = driver.findElement(By.id("error-message-id")).getText(); // Replace with actual error message element ID
            if (errorMessage.contains("Invalid credentials") || errorMessage.contains("error")) {
                System.out.println("Error message correctly displayed: " + errorMessage);
            } else {
                System.out.println("Test failed: Incorrect error message displayed.");
            }
        } catch (Exception e) {
            System.out.println("Test failed: No error message displayed.");
        }

        // Close the browser
        driver.quit();
}
}
