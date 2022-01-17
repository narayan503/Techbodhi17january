package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScrnShtExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com/");
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File narayanFile =scrshot.getScreenshotAs(OutputType.FILE);
		
		//Take current date and time
		SimpleDateFormat formatter =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date =new Date();
		String abc =formatter.format(date).toString().replace("/", "");
		String exactpathfilename = abc.replace(" ","").replace(":", "");
		System.out.println(exactpathfilename);
		
		String CapturePath = "C:\\hp\\New folder" +exactpathfilename+".png";
		
				
				
	   try{
		   //save the screenshot taken in destination path
		   FileUtils.copyFile(narayanFile, new File(CapturePath));
	   }
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
		driver.close();   
	   }
		
		
		
	}


