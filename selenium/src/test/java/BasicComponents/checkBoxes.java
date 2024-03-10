package BasicComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// check the checkbox1's status before and after clicking
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		System.out.println("Checkbox1 Before clicking: " + checkbox1.isSelected());
		checkbox1.click();
		System.out.println("Checkbox1 After clicking: " + checkbox1.isSelected());
		
		// check the checkbox2's status before and after clicking
		try {
			WebElement checkbox2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkBoxOption2")));
			System.out.println("Checkbox2 Before clicking: " + checkbox2.isSelected());
			checkbox2.click();
			System.out.println("Checkbox2 After clicking: " + checkbox2.isSelected());
		} catch (TimeoutException e) {
			System.out.println("Checkbox2 TimeoutException caught: " + e.getMessage());
		}
		
		// check total number of checkboxes
		System.out.println("Total number of checkboxes: " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//System.out.println("Total number of checkboxes: " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of checkboxes: " + checkboxes.size());
		
		// select all the checkboxes
		// checkboxes.clear();
		// System.out.println("Cleared the checkboxes");
		for(int i=0; i<checkboxes.size(); i++) {
            checkboxes.get(i).click();
            System.out.println("Checkbox" + (i+1) + " is clicked");
        }
		
		driver.quit();
		

	}

}
