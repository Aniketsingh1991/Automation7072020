package SeleniumFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set Chrome drivers path
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.get("http://sampleapp.tricentis.com/101/index.php");

		dr.findElement(By.id("nav_automobile")).click();

		WebElement makeDropDown = dr.findElement(By.name("Make"));
		Select sel = new Select(makeDropDown);
		sel.selectByIndex(4);
		Thread.sleep(3000);
		sel.selectByValue("Ford");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes Benz");

		dr.findElement(By.id("engineperformance")).sendKeys("200");
		dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2010");
		WebElement noofSeatsDropDown = dr.findElement(By.name("Number of Seats"));
		Select seat = new Select(noofSeatsDropDown);
		seat.selectByIndex(4);

		WebElement fuelTypeDropDown = dr.findElement(By.name("Fuel Type"));
		Select fuel = new Select(fuelTypeDropDown);
		fuel.selectByIndex(1);

		dr.findElement(By.id("listprice")).sendKeys("1000");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("ABC12CH54");
		dr.findElement(By.id("annualmileage")).sendKeys("100");

		dr.findElement(By.id("nextenterinsurantdata")).click();
		dr.findElement(By.id("firstname")).sendKeys("Aniket");
		dr.findElement(By.id("lastname")).sendKeys("Rajput");
		dr.findElement(By.id("birthdate")).sendKeys("02/11/1991");

		dr.findElement(By.xpath("//label[text()='Female']/span")).click();
		
		dr.findElement(By.id("streetaddress")).sendKeys("Porwal road");

		WebElement countryDropDown = dr.findElement(By.name("Country"));
		Select cou = new Select(countryDropDown);
		cou.selectByVisibleText("India");
		dr.findElement(By.id("zipcode")).sendKeys("411014");
		dr.findElement(By.id("city")).sendKeys("Pune");

		WebElement occupationDropDown = dr.findElement(By.name("Occupation"));
		Select occ = new Select(occupationDropDown);
		occ.selectByIndex(4);

		
		  //dr.findElement(By.className("ideal-check")).click();
		dr.findElement(By.xpath("//Label[contains(.,'Bungee')]/span")).click();
		  dr.findElement(By.id("website")).sendKeys("Http://abc.com");
		  dr.findElement(By.id("nextenterproductdata")).click();
		  dr.findElement(By.id("startdate")).sendKeys("09/26/2020");
		  
		  WebElement insuranceDropDown=dr.findElement(By.name("Insurance Sum"));
			Select ins= new Select(insuranceDropDown);
			ins.selectByIndex(2);
			
			WebElement meritDropDown=dr.findElement(By.name("Merit Rating"));
			Select mer= new Select(meritDropDown);
			mer.selectByIndex(1);
			
			WebElement damageDropDown=dr.findElement(By.name("Damage Insurance"));
			Select dam= new Select(damageDropDown);
			dam.selectByIndex(2);
			Thread.sleep(3000);
			
			dr.findElement(By.xpath("//input[@id='EuroProtection']//following::span[1]")).click();
			WebElement carDropDown=dr.findElement(By.name("Courtesy Car"));
			Select car= new Select(carDropDown);
			car.selectByVisibleText("Yes");
			dr.findElement(By.id("nextselectpriceoption")).click();	
			dr.findElement(By.xpath("//input[@id='selectsilver']//following::span[1]")).click(); // Select Silver
	    	Thread.sleep(1000);
			
	    	dr.findElement(By.id("nextsendquote")).click();
	    	dr.findElement(By.id("email")).sendKeys("aniket.s.rajput@gmail.com");
	    	dr.findElement(By.id("phone")).sendKeys("8485020821");
	    	dr.findElement(By.id("username")).sendKeys("Aniket");
	    	dr.findElement(By.id("password")).sendKeys("Pass1991");
	    	dr.findElement(By.id("confirmpassword")).sendKeys("Pass1991");
	    	dr.findElement(By.id("Comments")).sendKeys("Send the quotation as per given info.");
	    	dr.findElement(By.id("sendemail")).click();
	    	 dr.findElement(By.className("confirm")).click();
		 
	}
}