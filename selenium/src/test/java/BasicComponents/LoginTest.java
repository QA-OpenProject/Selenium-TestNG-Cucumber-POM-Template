package BasicComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class LoginTest {
    public static void main(String[] args) {
        // Setup the Chrome web driver
        WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize(); // Maximize the window

        // Input the username and password
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click the login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Verify the title of the page
        Assert.assertEquals("OrangeHRM", driver.getTitle());

        // Verify the lable name
        String act_lable = null;
        try {
            act_lable = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
            Assert.assertEquals("Dashboard", act_lable);
            System.out.println("Lable is correct");
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            act_lable = "";
            System.out.println("Lable is not correct");
        }

        // Quit the WebDriver session
        driver.quit();
    }

}
