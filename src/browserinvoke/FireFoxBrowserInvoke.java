package browserinvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserInvoke {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\adity\\Desktop\\Selenium gechodriver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		   WebDriver driver =new FirefoxDriver();
		   driver.manage().window().maximize();   //yamule screen maximize mode la chalte karan driver jo ahe toh minimize mode la chalat asto
		   
		   driver.get("https://www.google.com/search?client=firefox-b-d&q=fb");
		   Thread.sleep(5000);                            //yasaathi apan wrtii main method la throws kel ahe // ethe apan 5sec cha delay takla ahe 
		   driver.close();

	}

}
