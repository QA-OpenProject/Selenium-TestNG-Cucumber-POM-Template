package BasicComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Title: " + driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Title with back(): " + driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Title with forward(): " + driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println("Title with refresh(): " + driver.getTitle());
		
		driver.quit();

	}

}
