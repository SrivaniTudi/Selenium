package MouseActionsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlideXAxis {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		
		WebElement greenBar=driver.findElement(By.id("//span[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min' and @style='width: 54.902%;']"));
		System.out.println(greenBar.getLocation());
		
		
		//public class Slide1 { public static void main(String[] args) throws InterruptedException { RemoteWebDriver driver=new ChromeDriver(); driver.get("https://jqueryui.com/slider/#colorpicker"); 
		//driver.manage().window().maximize(); WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(frame); Actions action=new Actions(driver); 
		//WebElement greenslider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 54.902%;']")); 
		//System.out.println(greenslider.getLocation()); //(178, 115) 
		//Thread.sleep(5000); 
		//action.dragAndDropBy(greenslider, 50, 50).build().perform();
		//228,115 System.out.println(greenslider.getLocation());

	}
}
