package BasicComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();

        // search box
        driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
        // search button
        driver.findElement(By.name("submit_search")).click();
        
        // Locators
        // 1. ID
        // 2. Name
        // 3. Class Name
        // 4. Link Text
		/* driver.findElement(By.linkText("Printed Chiffon Dress")).click(); */
        // 5. Partial Link Text
        driver.findElement(By.partialLinkText("Printed Chiffon")).click();
        // 6. Tag Name
        // 7. CSS Selector
        // 8. XPath
        
        driver.quit();
    }

}
