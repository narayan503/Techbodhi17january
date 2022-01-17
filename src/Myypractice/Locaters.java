package Myypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   
		   driver.get("http://automationpractice.com/index.php");
		   driver.manage().window().maximize();
		   
		   //ID
		   WebElement searchbox=  driver.findElement(By.id("search_query_top"));
		  searchbox.sendKeys("T-shirts");
           
		  
		  //Name
		  driver.findElement(By.name("submit-search")).click();
		  
		  //linkText & PartialLinkText
		  
		 //driver.findElements(By.linkText("Printed Chiffon Dress")).click();
		  
		 // ((WebElement) driver.findElements(By.linkText(" Chiffon Dress"))).click();
	}
	}


