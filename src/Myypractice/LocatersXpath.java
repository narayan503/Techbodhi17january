package Myypractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\Desktop\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/goupa");
		driver.manage().window().maximize();
		
		// self- Selects the Current node 
	    String text=	driver.findElement(By.xpath("//a[contains(text(),'India Nippon Ele')]/self::a")).getText();
		System.out.println(text);
		
		// Parent - Select the parent of the current node (always one)
		 text=	driver.findElement(By.xpath("//a[contains(text(),'India Nippon Ele')]/parent::td")).getText();
		System.out.println(text);
		
		//child -(Select all the children of the current node (one or many))    //Ethe aplyala self cha child 0 milale tyamule apan ancestor la chek kel tr tyache child ahet including parennt 5 ahet trv te print kele 
		List<WebElement>child=driver.findElements(By.xpath("//a[contains(text(),'India Nippon Ele')]/ancestor::tr/child::td"));
		//ethe list<wb> ha retrn type ahe ani list la java.util and webElement la org.selenium karne....Ani jr single Element takaych asl tr apan list use kel nast ethe jast element ahet tyamule list use kel ahe
		System.out.println("No. of child nodes "+child.size());
		
		//Ancestor - Select all ancestors (parent ,grandsparent etc.)
		text=	driver.findElement(By.xpath("//a[contains(text(),'India Nippon Ele')]/ancestor::tr")).getText();
		System.out.println(text);  // Ancestor aplyala purn row send krto text madhe front cha webpage cha jyachawr apn clik kelel ahe tyacha
		
		//Descendant  - Select all descendants (children,grandchildren,etc.) of the curent node
		List<WebElement> descendant  =driver.findElements(By.xpath("//a[contains(text(),'India Nippon Ele')]/ancestor::tr/descendant::*"));
		System.out.println("No.of Descendant "+ descendant.size());
		
		//Following - Selects everything in the document after the closing tag of the current node/ self node (mnje aplya self node pasun khalche sgle je nodes yetat te sgle following node madhe yetat ani sgle warche preceding madjhe yetat) 
		List<WebElement> following =driver.findElements(By.xpath("//a[contains(text(),'India Nippon Ele')]/ancestor::tr/following::tr"));
	    System.out.println("No. of following "+ following.size());
	    
	    //following-sibling - Selects all siblings after the current node
	    List<WebElement> followingSibling =driver.findElements(By.xpath("//a[contains(text(),'India Nippon Ele')]/ancestor::tr/following-sibling::tr"));
	    System.out.println("NO . of following Siblingts "+followingSibling.size());
	
	     //preceding  -Select all nodes that appear before the current node in the document 
	    List<WebElement> preceding =driver.findElements(By.xpath("//a[contains(text(),'India Nippon Ele')]/ancestor::tr/preceding::tr"));
	     System.out.println("No of preceding elements "+ preceding.size());
	     
	     //preceding-sibling  - Select all siblings before the current node 
	     List<WebElement> precedingSibling =driver.findElements(By.xpath("//a[contains(text(),'India Nippon Ele')]/ancestor::tr/preceding-sibling::tr"));
	     System.out.println("No of preceding elements "+ precedingSibling.size());
	     
	}

}
