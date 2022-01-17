package browserCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
           //get command to invoke browser
           driver.get("http://www.seleniumframework.com/Practiceform/");
           //"https://www.seleniumframework.com/Practiceform/"
          // https://www.google.com/search?q=fb+login&rlz=1C1ZKTG_enIN910IN910&oq=fb&aqs=chrome.0.69i59j69i57j0i512l2j0i131i433i512j0i512l2j46i199i291i433i512j0i433i512.1706j0j4&sourceid=chrome&ie=UTF-8
           
           // command to take title of the page 
           String PageTitle=driver.getTitle();
           System.out.println(PageTitle);
           
           //command to take current URL
           String PagecurrentURL = driver.getCurrentUrl();
           System.out.println(PagecurrentURL);
           
           
           //close and quet
           
           driver.findElement((By.xpath("//button[text()='New Browser Tab']"))).click();   // he secnd tab ahe tyach wrcha website chi
           		driver.close(); //jr apn close kel tr tii wrtii dileli link opn hote bt ti close anii secnd link opn hote mnjech current link close hote 
        		  //driver.quit();  // jr quit kel tr time limit madhe donhi pn mnje ch sglyach close hotat
        		   
           		

	}

}
