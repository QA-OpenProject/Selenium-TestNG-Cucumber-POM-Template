package BasicComponents;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='dropdown-class-example']")));
		Select dropdown = new Select(dropdownElement);
		
		// Select by visible text
		dropdown.selectByVisibleText("Option2");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Select by value
		dropdown.selectByValue("option3");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Find total number of options in dropdown
		System.out.println("Total number of options in dropdown: " + dropdown.getOptions().size());
		
		// Print all options in dropdown
		for (WebElement option : dropdown.getOptions()) {
			System.out.println(option.getText());
		}
		
		driver.quit();
        

	}

}



// Dropdown having select tag in DOM
// Dropdown does not have select tag in DOM (input/div) - Bootstrap dropdown
// Auto suggest dropdown (Dynamic dropdown)