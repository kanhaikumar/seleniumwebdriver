package cssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathDemo {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.opencart.com");
     driver.manage().window().maximize();
     
     //Xpath with string attribute
   //  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("tshirt");
     
     //xpath with multiple attributes
     //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("tshirt");
      
     //xpath with 'and ' operator
    // driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("tshirt");
    // driver.findElement(By.xpath("//input[@name='search' or @placeholder='xyz']")).sendKeys("tshirt");
        
     //xpath with text()  inner text
    // driver.findElement(By.xpath("//*[text()=MacBook']")).click();
    /* 
     boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
     System.out.println(displaystatus);
     String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
     System.out.println(value);
     */
     
     //XPATH WITH CONTAIS()
     
     //driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");
     
     //xpath with start-with()
     driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");

     
	}

}
