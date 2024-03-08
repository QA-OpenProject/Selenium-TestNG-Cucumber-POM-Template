package BasicComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitylyWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        // Define the maximum time to wait for a particular element
        WebDriverWait wait = new WebDriverWait(driver, 5); // 5 seconds
    }
}
