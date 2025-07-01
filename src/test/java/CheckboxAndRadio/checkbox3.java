package CheckboxAndRadio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class checkbox3 {
	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		List<WebElement> cbs=driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		System.out.println(cbs.size());
		
		
		//total No of checkboxe-no Of boxes want to select=starting index;
		//3-2=1
		
		for(int i=1;i<cbs.size();i++){
			
			cbs.get(i).click();			
		}
	}

}
