package Inputboxandbutton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxandButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//driver.findElement((By.xpath("//button[text()='New Browser Tab']"))).click();

		// driver.findElement(By.id("button1")).click();
		// driver.findElement(By.name("email")).sendKeys("Rajkumar");
		// driver.findElement(By.className(""));
		// List<WebElement> al =driver.findElements(By.tagName("a"));
		// driver.findElement(By.linkText("This is a link")).click();
		// driver.findElement(By.partialLinkText("link")).click();
		// driver.findElement(By.cssSelector("textarea[name*='ssa']")).sendKeys("vak");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Narayan");  
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Dhawle");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();  
	
	}

}
