package FileUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		
		driver.switchTo().newWindow(WindowType.TAB); // same window with new tab
		driver.get("https://www.nopcommerce.com/en");
		
		driver.switchTo().newWindow(WindowType.WINDOW); // in new window
		driver.get("https://www.nopcommerce.com/en");
		
		
		//https://www.nopcommerce.com/en
	}

}
