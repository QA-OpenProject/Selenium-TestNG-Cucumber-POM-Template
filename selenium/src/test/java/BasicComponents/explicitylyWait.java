package BasicComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitylyWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        // Define the maximum time to wait for a particular element
        WebDriverWait wait = new WebDriverWait(driver, null);

        try {
            WebElement boxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
            boxElement.sendKeys("New Zealand");
        } catch (TimeoutException e) {
            // TODO: handle exception
            System.out.println("TimeoutException caught: " + e.getMessage());
        }
    }
}
