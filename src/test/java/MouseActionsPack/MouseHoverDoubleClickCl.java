package MouseActionsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDoubleClickCl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");	
		Thread.sleep(5000);
		WebElement field1=driver.findElement(By.id("field1"));
		WebElement field2=driver.findElement(By.id("field2"));
		WebElement copybtn=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions actions=new Actions(driver);
		field1.clear();
		field1.sendKeys("Vani");
		actions.doubleClick(copybtn).build().perform();
		
		String text1=field1.getDomProperty("value");
		String text2=field2.getDomProperty("value");

		if(text1.equals(text2)) {
			System.out.println("TestPass");
		}
		else {
			System.out.println("Testfail");
		}
		
	}
}
