package HeadlessMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {
	
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		String actual_title=driver.getTitle();
		//System.out.println(actual_title);
		String expected_title="nopCommerce demo store. Home page title";
		if (actual_title.contentEquals(expected_title)) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
			System.out.println(expected_title);
			
		}
		
		
	}

}
