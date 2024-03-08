package BasicComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.safari.SafariDriver;
// import org.openqa.selenium.safari.SafariOptions;

// import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class launchWeb {
     public static void main(String[] args) {
        // Setup the Chrome using WebDriverManager
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Setup the Firefox using WebDriverManager
        // WebDriverManager.firefoxdriver().setup();
        // WebDriver driver = new FirefoxDriver();

        // Setup the Safari using WebDriverManager
        // SafariOptions options = new SafariOptions();
        // SafariDriver driver = new SafariDriver(options);
        
        // Open the URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());
        String title = driver.getTitle();
        try {
            assertEquals("Practice Page", title);
            System.out.println("Title is correct");
        } catch (AssertionError e) {
            System.out.println("AssertionError caught: " + e.getMessage());
        }

        // Implicit wait for 500ms
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

        // Find the element by ID and send the keys
        WebElement textBox = driver.findElement(By.id("autocomplete"));
        textBox.sendKeys("New Zealand");

        //click the button
        WebElement button = driver.findElement(By.id("openwindow"));
        button.click();

        // Quit the WebDriver session
        driver.quit();
    }
}
