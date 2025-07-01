package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	
		//driver.findElement(By.id("filesToUpload")).sendKeys("D:\\Notes");
		
		//validation
		
		
		//multipleFiles
		
		String file1="D:\\Notes\\manual testing notes.txt";
		String file2="D:\\FAMILYAADHAR.txt";
		driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);
		//"D:\\FAMILYAADHAR.txt"
		
	}

}
