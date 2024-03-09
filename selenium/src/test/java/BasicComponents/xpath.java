package BasicComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class xpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");		
		driver.manage().window().maximize();
		
		String productName = driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
		System.out.println(productName);
		
		driver.quit();
	}
}


// How to write own xpath
// 1. Absolute xpath: /html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]
// 2. Relative xpath: //div[@class='product-container']

// Syntax: //tagname[@attribute='value']

//xpath having multiple attributes
//Syntax: //tagname[@attribute1='value' and @attribute2='value']

//xpath functions
//1. contains()
//Syntax: //tagname[contains(@attribute,'value')]
//Example: //input[contains(@name,'email')]
//2. starts-with()
//Syntax: //tagname[starts-with(@attribute,'value')]
//Example: //input[starts-with(@name,'em')]
//3. text()
//Syntax: //tagname[text()='value']
//Example: //a[text()='MacBook']
//4. normalize-space()
//Syntax: //tagname[normalize-space()='value']
//Example: //a[normalize-space()='MacBook']
//5. last()
//Syntax: (//tagname[@attribute='value'])[last()]
//Example: (//a[normalize-space()='MacBook'])[last()]
//6. position()
//Syntax: (//tagname[@attribute='value'])[position()]
//Example: (//a[normalize-space()='MacBook'])[1]

//xpath axes
//1. Ancestor
//Syntax: //tagname[@attribute='value']/ancestor::tagname
//Example: //a[normalize-space()='MacBook']/ancestor::div
//2. Ancestor or self
//Syntax: //tagname[@attribute='value']/ancestor-or-self::tagname
//Example: //a[normalize-space()='MacBook']/ancestor-or-self::div
//3. Child
//Syntax: //tagname[@attribute='value']/child::tagname
//Example: //div[@class='product-thumb']/child::div
//4. Descendant
//Syntax: //tagname[@attribute='value']/descendant::tagname
//Example: //div[@class='product-thumb']/descendant::div

//xpath operators
//1. and
//Syntax: //tagname[@attribute1='value' and @attribute2='value']
//Example: //input[@name='email' and @type='text']
//2. or
//Syntax: //tagname[@attribute1='value' or @attribute2='value']
//Example: //input[@name='email' or @type='text']
//3. not
//Syntax: //tagname[@attribute1='value' and not(@attribute2='value')]
//Example: //input[@name='email' and not(@type='password')]

//xpath with text
//Syntax: //tagname[text()='value']
//Example: //a[text()='MacBook']