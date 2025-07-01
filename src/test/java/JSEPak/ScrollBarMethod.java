package JSEPak;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarMethod {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	//scrolldown by pixel number
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,1500)", "");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	
	}

}
