package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
       // ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
	   //open url
		
		driver.get("https://ybnuniversityresult.in/admin/signin.php");
	   /* validate title of page
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("test passed");
	
		}
		else
		{
			System.out.println("test failed");
		}
		driver.close();
		*/
		
		// validate user login
		
		String username = "SuperStar@13#sunrise";
        String enteredPassword = "SuperStar@13#sunris";
		driver.findElement(By.id("txtUserId")).sendKeys("username");
        driver.findElement(By.id("txtPass")).sendKeys("enterredPassword");
        driver.findElement(By.xpath("//*[@id=\"ActionForm\"]/div[2]/label/input")).click();
        String correctPassword = "SuperStar@13#sunrise";

        if (enteredPassword.equals(correctPassword)) 
        {
        	System.out.println("login successfully");
        }
        else
        {
        	System.out.println("incorrect password");
        }
       
	}

}
