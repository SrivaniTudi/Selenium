package AlertsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertcl {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		//String msg1=driver.findElement(By.xpath("//button[@title='Click for JS Confirm']")).getText();
	
	//	System.out.println(msg1);
		driver.findElement(By.xpath("//button[@title='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
	/*	Alert alert=driver.switchTo().alert();
				alert.dismiss();
				Thread.sleep(3000);
				
				String exp_msg="You clicked: Cancel";
				
				String act_msg=driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText();
				Thread.sleep(3000);
				if(exp_msg.equals(act_msg))
					System.out.println("test pass");
				else
					System.out.println("Test fail");*/
				
			
	}

}
