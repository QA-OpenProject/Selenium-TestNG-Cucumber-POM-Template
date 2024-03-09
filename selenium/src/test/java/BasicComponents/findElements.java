package BasicComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {
	public static void main(String[] args) {
		// setup the driver
		WebDriver driver = new ChromeDriver();

		// open the website
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();

		// count the number of sliders
		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders: " + sliders.size());

		// count the number of images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: " + images.size());

		// count the number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: " + links.size());

		// close the driver
		driver.quit();
	}
}

// length of the array: array.length()
// lengtht of the string: string.lengtht()
// size of the list: list.size()
// size of the set: set.size()
// size of the map: map.size()
// size of the HashMap: hashMap.size()

// Scenario1: locator is matching with single web element
// findElement() => return the web element with the type of WebElement
// findElements() => return the web element with the type of List<WebElement>

// Scenario2: locator is matching with multiple web elements
// findElement() => return the first web element with the type of WebElement
// findElements() => return the list of web elements with the type of List<WebElement>

// Scenario3: locator is not matching with any web element
// findElement() => throw NoSuchElementException
// findElements() => return an empty list