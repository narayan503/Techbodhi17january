package AlertInSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.activation.MailcapCommandMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample {

	

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Specify the file location
		StringSelection sel =new StringSelection("C:\\resume\\5045826.12042020.pdf");
		                                                         //(string,toolkit) yaa donhi line windows madhn location denyasaati ahet karan selenium ter windows madhe chalat nai
		//Copy to clipboard                                      // ani ya don method nii control c kel apan robot saati
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("selection" +sel);  // resume ch location pohochl ki nai te cnfrm krnyasaati print kel
		
		//open naukri.com
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		//Click on Upload Resume button
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();  ////button[contains(text(),'Upload Resume')]
		Thread.sleep(3000);                                                               //button[@title='I am Professional']
		
		//Click on upload resume button
		//driver.findElement(By.name("uploadCV")).click();
		//Thread.sleep(1000);
	
		
		//Create object of robot class
		Robot robot =new Robot();
		Thread.sleep(1000);
		
		//press Enter
		robot.keyPress(KeyEvent.VK_ENTER);  // windows open zalyas mnje ch jithe file takawi lagte "c" drive madhli tihe curser gheun yenyasaati apan enter kel ahe jyane tihe file takta yaawi 
		
		//release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);  //nantr enter karun sodun dil mnje ch release kel ...(tithe ata tii resh ali mnje apn type kru shkto for example)
		
		//Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);        // ya don method nii wrti copy keleli resume file me tithe CNTRL V keli 
		
		//Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);         // ya don nii CNTRL V kelel release kel mnje tii file tithe ata gelii
		Thread.sleep(1000);
		
		//press Enter
		robot.keyPress(KeyEvent.VK_ENTER);      // nantr sgl upload zalyanantr enter kel (ethe open mnje ch enter)
		robot.keyRelease(KeyEvent.VK_ENTER);     
		
		
		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		

	}

}
