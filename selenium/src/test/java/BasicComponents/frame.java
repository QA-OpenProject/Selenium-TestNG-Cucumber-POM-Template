package BasicComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames");
		
		// Frame1
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		// Return to main page
		driver.switchTo().defaultContent();
		
		// Frame3
		WebElement frm3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("3333");
		
		//inner frame
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click(); // select first radio button in frame
		driver.switchTo().defaultContent();
		
		//close the browser
		driver.quit();

	}

}
