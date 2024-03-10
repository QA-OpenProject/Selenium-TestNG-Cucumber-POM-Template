package BasicComponents;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdownWithAutoSuggestion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// Open the browser and go to google.com
		driver.get("https://www.google.com/");
		
		// Type in the search bar
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		// Wait for the auto suggestion list to appear
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Get all the suggestions
		List<WebElement> suggestionlist = driver.findElements(By.xpath("(//div[contains(@class,'wM6W7d')]//span))"));
		System.out.println("Suggestions are:" + suggestionlist);
		
		// Loop through the suggestions and select the one that matches
		for (WebElement suggestion : suggestionlist) {
			if ("selenium webdriver".equals(suggestion.getText())) {
				suggestion.click();
				break;
			}
		}
		
		// Close the browser
		driver.quit();
		

	}

}
