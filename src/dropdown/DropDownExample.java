package dropdown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
  
  Select oselect = new Select (driver.findElement(By.xpath("//select[@id='programming-languages']")));   // jeva inspect madhe tag select yeto teva object tayar karne java cha rule nusar tr developer la ethe select ch ghyaw lagt kadhi tr dusr yet
  
  oselect.selectByIndex(5);
  Thread.sleep(5000);
  
  oselect.selectByValue("Python");   //value mnje inspect madhla attribute tyamule attribute cha samorchi property ethe takne
  Thread.sleep(5000);
  
  oselect.selectByVisibleText("C#");  // mnjhe inspect open kelyas je highlighgt madhe ast je ki black color madhe ast te takne 
  
  List<WebElement> elementCount =oselect.getOptions();  // radiobutton madhe aplyala common value shodhun sglyanchi list banvavi lagaychi bt the .getOption method ahe 
  
  for (int i=0; i<elementCount.size()-1; i++)
  {
	  System.out.println(elementCount.get(i).getText());
  }
  
  
  
  
  
  
  
	}

}
