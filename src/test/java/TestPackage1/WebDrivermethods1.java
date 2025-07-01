package TestPackage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDrivermethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		RemoteWebDriver driver=new ChromeDriver();
		
		//1.driver.get(String url)
		driver.get("https://www.facebook.com/"); //window index=0
		String title=driver.getTitle();
		System.out.println("Title is:"+title);
		
		//2. driver.getWindowHandle()		
		String windowId=driver.getWindowHandle();
		System.out.println("First WindowId is:"+windowId);
		
		//3. driver.getCurrentUrl();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("currentUrl is:"+currentUrl);
		
		//4.driver.findElements(By by);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no of links:"+links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("no of images:"+images.size());
		
		List<WebElement> allTags=driver.findElements(By.xpath("//*"));
		System.out.println("alltags:"+allTags.size());
		
		//5.driver.findElement(By by);
		//driver.findElement(By.linkText("Try it Yourself")).click();//window index=1
		
		//6.driver.getpageSource();
		String pageSource=driver.getPageSource();
		//System.out.println("page source is:"+pageSource);
		
		WebElement element=driver.findElement(By.xpath("//a[@href='/r.php?entry_point=login']"));
		element.click();
       
		Thread.sleep(3000);
		
		//8.driver.close();
		//driver.close();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		//7. driver.getWindowhandles();
		Set<String> windowIds1=driver.getWindowHandles();
		//convert Set to List
		List<String> windowIds=new ArrayList(windowIds1);
		System.out.println(windowIds.size());
		System.out.println(windowIds);
		driver.switchTo().window(windowIds.get(0))	;

		//9. driver.switchTo()
		//driver.switchTo().window(windowIds.get(1));
		Thread.sleep(3000);
		//driver.close();
		

		
		
		
		
	}

}
