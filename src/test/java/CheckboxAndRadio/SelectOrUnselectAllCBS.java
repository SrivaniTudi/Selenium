package CheckboxAndRadio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelectOrUnselectAllCBS {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		List<WebElement> cbs=driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		System.out.println(cbs.size());
		
		
		
		for(int i=0;i<cbs.size();i++){
			if(cbs.get(i).isSelected()) {
				cbs.get(i).click();
			}
			else {
				cbs.get(i).click();
			}
			//=========================to Unselect==========================
			Thread.sleep(3000);
			if(cbs.get(i).isSelected()) {
				cbs.get(i).click();
			}
			else {
				cbs.get(i).click();
			}
						
		}
	}

}
