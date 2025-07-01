package AlertsPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlertCl {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button['Click for JS Alert']")).click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		String exp_msg="You successfully clicked an alert";
		String act_msg=driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		
		if(exp_msg.equals(act_msg)) 
			System.out.println("test Pass");
			else
			System.out.println("Test Fail");
		
		
	}

}
