package cssSelector;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cssLocator {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.nopcommerce.com/");
      driver.manage().window().maximize();
      driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	}

}
