package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		Select ooselect =new Select (driver.findElement(By.xpath("//select[@id='selenium_suite']")));
		  
		  
		 // ooselect.selectByIndex(1);
		 // ooselect.selectByIndex(3);
		  
		 // ooselect.selectByValue("WebDriver");
		
		//ooselect.selectByVisibleText("Selenium RC");
		
		List<WebElement> elementCount =ooselect.getOptions();  // radiobutton madhe aplyala common value shodhun sglyanchi list banvavi lagaychi bt the .getOption method ahe 
		  
		  for (int i=0; i<elementCount.size()-1; i++)
		  {
			  System.out.println(elementCount.get(i).getText());
		  }
	}

}
