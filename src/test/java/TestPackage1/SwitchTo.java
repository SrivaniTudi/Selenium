package TestPackage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windowIds= new ArrayList<String>(windowHandles);
		
		
		String parentUrl=windowIds.get(0);
		System.out.println("1st url id::"+parentUrl);

		
		String currentUrl=driver.getCurrentUrl();	
		System.out.println("curnt url::"+currentUrl);
		
		
		driver.findElement(By.linkText("PNR STATUS")).click();
		driver.navigate().back();
		
		System.out.println(windowIds.size());
		System.out.println(windowIds);
		
		for(String id:windowIds) {
			System.out.println(id);
		}
		
		
		
	
		
	}
	
}
