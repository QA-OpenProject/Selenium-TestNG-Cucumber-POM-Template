package BasicComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class launchWeb {
     public static void main(String[] args) {
        // Setup the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Open the URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("Title of the page: " + driver.getTitle());

        // Implicit wait for 500ms
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

        // Find the element by ID and send the keys
        WebElement textBox = driver.findElement(By.id("autocomplete"));
        textBox.sendKeys("New Zealand");

        // Quit the WebDriver session
        driver.quit();
    }
}
