package SeleniumFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		WebElement ele = dr.findElement(By.xpath("//tagName[@attributeName='Attribute value']"));
		//WebElement ele = dr.findElement(By.xpath("//tagName[@attributeName1='Attribute value'][@attributeName2='Attribute value']"));
		//WebElement ele = dr.findElement(By.xpath("//tagName[text()='Automobile']"));
		//WebElement ele = dr.findElement(By.xpath("//tagName[contains(text(),'Auto']"));
		WebElement elex = dr.findElement(By.xpath("//lable[text()='Female']/span"));
		
		
		
		String data = ele.getText();
	    System.out.println(data);
	    ele.click();

	}

}
