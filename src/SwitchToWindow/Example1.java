package SwitchToWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();

		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();

		// System.out.println(driver.getTitle());//yawrn aplyala smjt driver
		// nemk parent window la focus krt ahe ki child window la

		// tr ata mla child window la focus karaych ahe mnje switch karaych ahe
		// ani aplyala tya window chii ID kiwa key mahiti karun ghyaychi asl
		// tr pudchi method ahe getwindowHandles() ani yach method wrn aplyala
		// nemk kiti window opn ahet te tyancha ID wrn smjt

		Set<String> s = driver.getWindowHandles();  // tr haa tya window chi id deto ani s madhe save krto

		for (String i : s) {
			//System.out.println(i);            //hey fct ID provide krt
			String t = driver.switchTo().window(i).getTitle();  //tr kiti windwo ahet te switch hotat ani tyanchi id title madhe change hote
			System.out.println(t);                              // ani t madhe save hote aani last la t print
		}

	}

}
