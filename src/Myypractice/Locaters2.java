package Myypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   
		   driver.get("http://automationpractice.com/index.php");
		   driver.manage().window().maximize();
		   
		   //classname  (find out how many images)
		   
		  int sliders= driver.findElements(By.className("homeslider-container")).size();    // size aplyala kiti images ahet te sangto
                 System.out.println(sliders);
                 
           //Tagname  ( find out how MNY LINKS are there in page)
                 
                 int links= driver.findElements(By.tagName("a")).size();     
                 System.out.println(links);
                 
	}

}
