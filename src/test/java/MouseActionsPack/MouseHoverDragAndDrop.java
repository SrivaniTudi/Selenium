package MouseActionsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//div[text()='Washington'][2]"));
		WebElement target=driver.findElement(By.xpath("//div[text()='United States']"));
		Thread.sleep(5000);
		System.out.println(source.getText());
		System.out.println(target.getText());
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source,target).build().perform();
		
	}

}
