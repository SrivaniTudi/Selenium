package CheckboxAndRadio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class checkbox1 {
	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		WebElement BMW=driver.findElement(By.id("bmwcheck"));
		System.out.println(BMW.isSelected());
		BMW.click();
		System.out.println(BMW.isSelected());
		
	}

}
