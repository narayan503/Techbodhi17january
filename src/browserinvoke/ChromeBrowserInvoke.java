package browserinvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInvoke {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	   Thread.sleep(5000);        // Ethe seconds milliswcnds madhe takle ahet mnjech hey 5sec ahet ...hey browser open zalyas jr tyala kontahi source
	   driver.close();            //milt nsl tr tyan 5 sec wet karaw manun ....ani hey source mialala tarisudhha 5 sec wt krt ch tithe 
		                          // yacha another way option aplyaala ...implicitelywait haa ahe haa yala jr apan tm 5 sec dila tr haa tevda wt krto bt 
                                  // jr tevdya welech aat tyala browser launch zal tr toh 5 sec wt ch krt basat nahi launch houn jaato 
	}                             // Thread sleep sark kert nai

}
                                 //implicitly is more bettr than thread to better tester