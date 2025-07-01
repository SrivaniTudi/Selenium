package TestPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators1 {

	public static void main(String[] args) {
		
	
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[starts-with(text(),'Create new')]")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
			
			//isDisplayed
			WebElement logo=	driver.findElement(By.xpath("//img[@alt='Facebook']"));
			System.out.println("logo status:"+logo.isDisplayed());
	
		
		//isEnabled
		WebElement firstName=	driver.findElement(By.xpath("//input[@name='firstname']"));
		System.out.println("FirstName textbox status:"+firstName.isEnabled());
		
		WebElement secondName=	driver.findElement(By.xpath("//input[@name='lastname']"));
		System.out.println("SecondName textbox status:"+secondName.isEnabled());
		
		
		
		//is Selected
		WebElement genderMale=driver.findElement(By.xpath("//input[@id='sex' and @value='2']"));
		System.out.println("gender radio button status:"+genderMale.isSelected());
		
		WebElement genderFemale=driver.findElement(By.xpath("//input[@id='sex' and @value='1']"));
		System.out.println("gender radio button status:"+genderFemale.isSelected());
		
		
		
		
			

	}

}
