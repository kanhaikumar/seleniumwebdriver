package cssSelector;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cssLocator {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.geeksforgeeks.org/courses?source=google&medium=cpc&device=c&keyword=geeksforgeeks&matchtype=e&campaignid=20039445781&adgroup=147845288105&gad_source=1&gclid=Cj0KCQjwiuC2BhDSARIsALOVfBJOxf1v-6MtZdip6TfdVBplEGLwzIR0I0TlkTGzO1hJCl07NW0SaWgaAhyjEALw_wcB");
      driver.manage().window().maximize();
      //driver.findElement(By.cssSelector("input[placeholder='What do you want to learn today?']")).sendKeys("datastructure");
      //driver.findElement(By.cssSelector("#[placeholder='What do you want to learn today?']")).sendKeys("datastructure");
      
	}

}
