package MouseActionsPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMoveElement {
	public static void main(String[] args) {
		
	//	build() is a method which creates an Action.
		//perform() is To complete an action complete method is used.
	//1.MouseHover--Move to element
	// 2. click	
	//3. Right Click
	//4.	Double Click
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement ele=driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions action=new Actions(driver);
	action.moveToElement(ele).build().perform();	
	
	WebElement com=driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));
	//Actions action1=new Actions(driver);
	action.moveToElement(com).build().perform();
	
	driver.findElement(By.xpath("//a[text()='Printers']")).click();
	
	//String name=driver.findElement(By.xpath("//div[text()='4★ & above']")).getText();
	WebElement name1=driver.findElement(By.xpath("//div[text()='4★ & above']"));
	System.out.println(name1.getText());
	

	
		
	}

}
