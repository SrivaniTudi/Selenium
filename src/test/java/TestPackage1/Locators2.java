package TestPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		String website=driver.getCurrentUrl();
		
		// we can use direct click
		//driver.findElement(By.linkText("REGISTER")).click();
			
		//or 
		WebElement registerLink=driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		
	/*	WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Srivani");
		Thread.sleep(3000);
		//firstname.clear();
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("Tudi");
		Thread.sleep(3000);
		//lastname.clear();
		
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9701126674");
		Thread.sleep(3000);
		//phone.clear();
		
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("vani@gmail.com");
		Thread.sleep(3000);
		//email.clear();
		
		WebElement address1=driver.findElement(By.name("address1"));
		address1.sendKeys("secunderabad");
		Thread.sleep(3000);
		//address1.clear();
		
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("Hyderabad");
		Thread.sleep(3000);
		//city.clear();
		
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("Telangana");
		Thread.sleep(3000);
		//state.clear();
		
		
		WebElement postalCode=driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("500026");
		Thread.sleep(3000);
		//postalCode.clear(); */
		
		Select countrydropdown=new Select(driver.findElement(By.name("country")));
		//countrydropdown.selectByVisibleText("AUSTRALIA");
		//countrydropdown.selectByValue("ANGOLA");
		countrydropdown.selectByIndex(9); 
		
		List<WebElement> countryList=countrydropdown.getOptions();
		System.out.println("countries List::"+countryList.size());
		
	/*	for(int i=0;i<countryList.size();i++) {
			System.out.println(countryList.get(i).getText());
		}
		
		*/
		for(WebElement countries: countryList) {
			System.out.println(countries.getText());
		}
		
		
		
		
		
		WebElement submit=driver.findElement(By.name("submit"));
		//submit.submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
}
