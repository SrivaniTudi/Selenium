package FileUpload;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(5000);
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(sourcefile.exists());
	//	File targetFile=new File("D:\\eclipse\\workspace\\Selenium\\screenshots\\fullpage.png");
		File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		//targetFile.exists();
		
		
		sourcefile.renameTo(targetfile1);
		
		//select content screenshot
		
		//
	}

}
