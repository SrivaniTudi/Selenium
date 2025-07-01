package CheckboxAndRadio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RadioButtonsCl {
	public static void main(String[] args) throws InterruptedException {
		

	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	
	WebElement bmwradio=driver.findElement(By.id("bmwradio"));
	WebElement benzradio=driver.findElement(By.id("benzradio"));
	WebElement hondaradio=driver.findElement(By.id("hondaradio"));
	System.out.println("Status before selection");
	System.out.println("bmwradio:"+bmwradio.isEnabled());
	bmwradio.click();
	Thread.sleep(2000);
	benzradio.click();
	Thread.sleep(2000);
	hondaradio.click();
	
	}


}
