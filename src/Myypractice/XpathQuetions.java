package Myypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathQuetions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();

		// 1) find the signup button from the registration form present in the
		// facebook application .(child)
		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[10]/button")).click();

		// 2) Locate Firstname field from signup button in facebook (parent)
		driver.findElement(By.xpath("//button[@id='u_0_10_kK']/parent::*/parent::*/child::div[1]/div/div[1]")).click();
		//// button[@id='u_0_10_mN']/parent::*/parent::*//input[@id='u_0_j_pm']

		// 3)Identify the Password from mobile number filed in facebook
		// .(following)
		//// input[@id='u_0_o_Ss']/following::*//input[@id='password_step_input']

		// 4)Locate mobile number from newpassword field in facebook (Ancestor)
		//// input[@id='password_step_input']/ancestor::*//input[@id='u_0_o_2d']

		// 5) Locate surname from female radio button in facebook (Ancestor)
		//// label[contains(text(),'Female')]/ancestor::*//input[@id='u_0_l_GG']

		// 6)

	}

}
