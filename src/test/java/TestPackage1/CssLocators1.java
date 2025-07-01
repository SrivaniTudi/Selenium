package TestPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//tagId
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("laptop");
		
		//tag.className
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iphone");
		
		//tag[attribute='value']
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("jeans");
		
		//tag[]
		driver.findElement(By.cssSelector("input[class]")).sendKeys("Washing Machine");
		
		
	}

}
