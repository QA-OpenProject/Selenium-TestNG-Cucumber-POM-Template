package BasicComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// Declaring the explicit wait
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// System.out.println("Implicit wait is applied");
		
		// Explicit wait
		try {
			WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
			username.sendKeys("Admin");
			System.out.println("Username is entered");
			
			WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
			password.sendKeys("admin123");
			System.out.println("Password is entered");
		} catch (TimeoutException e) {
			System.out.println("TimeoutException caught: " + e.getMessage());
		}
		
		driver.quit();

	}

}


// sleep() -- provide by java, not selenium
// advantage: easy to use
// disadvantage: not dynamic, it will get exception if the time is not enough, or it will waste time if the time is too long.


// Implicit wait -- provide by selenium
// advantage: easy to use, it will apply to all the elements in the page, and it will not wait till maximum time if the the element is found.
// disadvantage: not dynamic, it will get exception if the time is not enough, or it will waste time if the time is too long.

// Explicit wait -- provide by selenium
// advantage: dynamic, it will wait until the condition is met
// disadvantage: need to import the package, and need to create the object, and need to use the method. It is not easy to use.