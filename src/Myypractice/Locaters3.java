package Myypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// Tag & ID
         //driver.findElements(By.cssSelector("input#email")).sendKeys("nnn");
		
		// driver.findElements(By.cssSelector("#email")).sendKeys("David");

		// Tag & Class
		// driver.findElements(By.cssSelector("input.inputtext")).sendKeys("narayan");
		// driver.findElements(By.cssSelector(".inputtext")).sendKeys("narayan");

		// Tag & attribute
		// driver.findElements(By.cssSelector("[name=email]")).sendKeys("Smith");
		// driver.findElements(By.cssSelector("input[name=email]")).sendKeys("Smith");

	}

}
