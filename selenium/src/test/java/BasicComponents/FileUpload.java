package BasicComponents;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
    public static void main(String[] args) {
        // Setup the Chrome using WebDriverManager
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://the-internet.herokuapp.com/upload");
        File uploadFile = new File("/Users/username/Downloads/picture/CrowdFunding2.png");

        // Find the element by ID and send the keys
        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("/Users/username/Downloads/abc.txt");

        // Quit the WebDriver session
        driver.quit();
    }
}
