package BasicComponents;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdwonsWithouSelectClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Click on the dropdown to open the list of options
		driver.findElement(By.id("month")).click();
		
		// Get all the options
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		// Loop through the options and select the one that matches
		for (WebElement option : options) {
			if ("Jun".equals(option.getText())) {
				option.click();
				break;
			}
		}
		
		// Close the browser
		driver.quit();

	}

}
