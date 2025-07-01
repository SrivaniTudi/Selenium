package TestPackage1;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL1 {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		URL url=new URL("https://demo.nopcommerce.com/");
		
		
	
	
	driver.get("https://demo.nopcommerce.com/");
	
	
	}
	

}
