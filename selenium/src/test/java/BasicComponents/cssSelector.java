package BasicComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) { 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/");
		// wait for 5 seconds
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  
	  // CSS Selector 
	  // 1. Tag and ID
	  driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Apple MacBook Pro"); 
	  
	  // 2. Tag and Class
	  driver.findElement(By.cssSelector("input.search-box-text")).clear(); 
	  
		/*
		 * // 3. Tag and Attribute
		 * driver.findElement(By.cssSelector("input[name='q']")).
		 * sendKeys("Apple MacBook Pro 2");
		 * 
		 * // 4. Tag, Class and Attribute
		 * driver.findElement(By.cssSelector("input.search-box-text[name='q']")).clear()
		 * ;
		 * 
		 * // 5. Tag, Class and ID
		 * driver.findElement(By.cssSelector("input.search-box-text#small-searchterms"))
		 * .sendKeys("Apple MacBook Pro 3");
		 * 
		 * // 6. Tag and nth-child
		 * driver.findElement(By.cssSelector("input:nth-child(2)")).clear();
		 * 
		 * // 7. Tag and nth-of-type
		 * driver.findElement(By.cssSelector("input:nth-of-type(2)")).
		 * sendKeys("Apple MacBook Pro 4");
		 * 
		 * // 8. Tag and last-child
		 * driver.findElement(By.cssSelector("input:last-child")).clear();
		 * 
		 * // 9. Tag and last-of-type
		 * driver.findElement(By.cssSelector("input:last-of-type")).
		 * sendKeys("Apple MacBook Pro 5");
		 */
	  
	  driver.quit(); }

	/*
	 * public static void main(String[] args) { WebDriver driver = new
	 * ChromeDriver(); driver.get("https://demo.nopcommerce.com/");
	 * 
	 * driver.findElement(By.id("small-searchterms")).sendKeys("Apple");
	 * driver.manage().window().maximize(); System.out.println("Search box");
	 * 
	 * driver.quit(); }
	 */
}

// tag and id: input#small-searchterms
// tag and class: input.search-box-text
// tag and attribute: input[name='q']
// tag, class and attribute: input.search-box-text[name='q']
// tag, class and id: input.search-box-text#small-searchterms
// tag and nth-child: input:nth-child(2)
// tag and nth-of-type: input:nth-of-type(2)
// tag and last-child: input:last-child