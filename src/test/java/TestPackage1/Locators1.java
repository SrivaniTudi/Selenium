package TestPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
	/*	//driver.findElement(By.partialLinkText("create account")).click();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("srivani");
		driver.findElement(By.name("lastname")).sendKeys("Tudi");
		driver.findElement(By.name("reg_email__")).sendKeys("9701126674");
		driver.findElement(By.id("password_step_input")).sendKeys("vani@1234");
		driver.findElement(By.name("websubmit")).click();	
		*/
		WebElement element=driver.findElement(By.xpath("//button[@name= 'login']"));
		element.click();
		Thread.sleep(2000);
		//driver.navigate().refresh();
		driver.navigate().back();
		WebElement createaccount=driver.findElement(By.xpath("//a[@href=\"/r.php?entry_point=login\"]"));
		createaccount.click();
		
		
		
		
		
		
		
		}

}
