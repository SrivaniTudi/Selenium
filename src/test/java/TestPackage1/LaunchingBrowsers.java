package TestPackage1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowsers {
	
	public static void main(String[] args) {
		
		String browserName;
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter browser name");
		browserName=scanner.nextLine();
		
		WebDriver driver;
		
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		}
		
		if(browserName.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Ivalid browserName");
		}
		
		
		
	}

}
