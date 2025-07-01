package CheckboxAndRadio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class multiplecheckboxes {

	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		System.out.println(checkboxes.size());
		
		for(WebElement cb:checkboxes){
			cb.click();			
		}
		
	}

}
