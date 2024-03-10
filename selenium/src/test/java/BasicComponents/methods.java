package BasicComponents;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		
		// get method
		// get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// getTitle
		String title = driver.getTitle();
		System.out.println("Title is:" + title);
		
		// getCurrentUrl
		String url = driver.getCurrentUrl();
		System.out.println("URL is:" + url);
		
		// getPageSource
		String pageSource = driver.getPageSource();
		/* System.out.println("Page Source is:" + pageSource); */
		
		// getWindowHandle
		String windowHandle = driver.getWindowHandle();
		System.out.println("Window Handle  is:" + windowHandle);
		
		// getWindowHandles
		/*
		 * driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click
		 * (); Set<String> windowHandles = driver.getWindowHandles();
		 * System.out.println("Window Handles is:" + windowHandles);
		 */
		
		// conditional method
		// isDisplayed
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("Logo is displayed:" + logo.isDisplayed());
		
		// isEnabled
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		System.out.println("Username is enabled:" + username.isEnabled());
		
		// isSelected
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("gender-male")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Male is selected:" + driver.findElement(By.id("gender-male")).isSelected());
		System.out.println("Female is selected:" + driver.findElement(By.id("gender-female")).isSelected());
		
		// navigation method
		
		// browser method
		
		// wait method
		
		// quit method
		driver.quit();
	}
}