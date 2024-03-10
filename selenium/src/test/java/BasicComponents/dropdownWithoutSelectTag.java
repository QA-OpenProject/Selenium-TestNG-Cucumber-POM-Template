package BasicComponents;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdownWithoutSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Click on the dropdown to open it
		driver.findElement(By.id("month")).click();
		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(monthList.size());
		
		// Select the value from the dropdown
		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			if (monthList.get(i).getText().equals("Dec")) {
				monthList.get(i).click();
				break;
			}
		}
		
		// Selcet multiple values from the dropdown
		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			if (monthList.get(i).getText().equals("Dec") || monthList.get(i).getText().equals("May")) {
				monthList.get(i).click();
			}
		}

	}

}
