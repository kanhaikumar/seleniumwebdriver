package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class contactform {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://pushpanjalivilla.com/contact.php");
	}

}
