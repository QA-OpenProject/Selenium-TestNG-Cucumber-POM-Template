package BasicComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// 1st way to switch to frame
		driver.switchTo().frame("courses-iframe");		
		driver.findElement(By.cssSelector("a[href*='sign_in']")).getText();
		
		// 2nd way to switch to frame
		driver.switchTo().defaultContent();		
		driver.findElement(By.id("name")).sendKeys("Hello");
		
		
		//close the browser
		driver.quit();

	}

}
