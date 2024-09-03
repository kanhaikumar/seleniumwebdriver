package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class pushpanjaliBooknow {

    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second timeout

        try {
            // Step 1: Navigate to the website
            driver.get("https://pushpanjalivilla.com/book_now.php");

            // Step 2: Wait for the "Check Availability" button to be clickable and click on it
            driver.findElement(By.xpath("//*[@id=\"ActionForm\"]/div[2]/label/input")).click();
            checkAvailabilityButton.click();

            // Step 3: Verify that the "Book Now" form opens
            WebElement bookNowForm = driver.findElement(By.id("bookingForm")); // Adjust the locator as needed
            if (bookNowForm.isDisplayed()) {
                System.out.println("Book Now form is displayed.");

                // Step 4: Enter valid data in the "Check In" field
                WebElement checkInField = driver.findElement(By.name("checkin"));
                checkInField.sendKeys("2024-09-05");

                // Step 5: Enter valid data in the "Check Out" field
                WebElement checkOutField = driver.findElement(By.name("checkout"));
                checkOutField.sendKeys("2024-09-07");

                // Step 6: Enter a valid phone number in the "Your Phone No." field
                WebElement phoneNumberField = driver.findElement(By.name("phone"));
                phoneNumberField.sendKeys("9876543210");

                // Step 7: Enter a valid name in the "Your Name" field
                WebElement nameField = driver.findElement(By.name("name"));
                nameField.sendKeys("John Doe");

                // Step 8: Select the desired amenities (assuming checkbox or dropdown)
                WebElement amenitiesCheckbox = driver.findElement(By.name("amenities"));
                if (!amenitiesCheckbox.isSelected()) {
                    amenitiesCheckbox.click();
                }

                // Step 9: Click the "Check Availability" button again
                checkAvailabilityButton = driver.findElement(By.xpath("//button[contains(text(), 'Check Availability')]"));
                checkAvailabilityButton.click();

                // Step 10: Verify the success message or relevant information is displayed
                // Replace with the actual locator for the success message
                WebElement successMessage = driver.findElement(By.xpath("//div[@class='success-message']"));
                if (successMessage.isDisplayed()) {
                    System.out.println("Booking form submitted successfully. Success message displayed.");
                } else {
                    System.out.println("Booking form submission failed. Success message not displayed.");
                }
            } else {
                System.out.println("Book Now form is not displayed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
