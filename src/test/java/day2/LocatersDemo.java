package day2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatersDemo {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.opencart.com/");
     driver.manage().window().maximize();
     
     //name
    //driver.findElement(By.name("search")).sendKeys("Mac");
     //id
    //boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
    //System.out.println(logoDisplaystatus);
     
     //link test & partial link text
    // driver.findElement(By.linkText("Tablets")).click();
    // driver.findElement(By.partialLinkText("ets")).click();
    //FIND SIMIAR HOW MANY LIKS ARE THERE IN HEADER?
    //List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
    //System.out.print("total number of header links:"+headerLinks.size());
     
     //tagname
     List<WebElement>links=driver.findElements(By.tagName("a"));
     System.out.println("total number of links : "+links.size());
     for (WebElement link : links) {
    	    // Print the text of the link
    	    System.out.println("Link Text: " + link.getText());
    	    
    	    // Print the URL of the link
    	    System.out.println("Link URL: " + link.getAttribute("href"));
    	}
     //find all image 
     //List<WebElement>images=driver.findElements(By.tagName("img"));
     //System.out.println("total number of images: "+images.size());
     
     
	}

}
