package ActionsClass;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionClassMore {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		String baseUrl ="https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder =new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)  //ethe shift dablyamule pdhe rajkumar capital madhe takanar
				.sendKeys(txtUsername, "rajkumar") 
				.keyUp(txtUsername, Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick().build();    // .contextClick mnje right click krto toh
		
		seriesOfActions.perform();
	}

}
