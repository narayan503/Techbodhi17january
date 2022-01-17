package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sdetDExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.epfindia.gov.in/site_en/index.php");
		
		Actions act = new Actions(driver);
	WebElement	services=driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
	WebElement	Employers=driver.findElement(By.xpath("//a[contains(text(),'For Employers')]"));
	WebElement	Employees=driver.findElement(By.xpath("//a[contains(text(),'For Employees')]"));
	
	act.moveToElement(services).build().perform();
	act.moveToElement(Employers).build().perform();
	act.moveToElement(Employees).click().build().perform();
	
	
	act.moveToElement(services).moveToElement(Employers).moveToElement(Employees).click().build().perform();     //shortcut
	}

}                    // THIS IS MOUSE OVER ACTION

