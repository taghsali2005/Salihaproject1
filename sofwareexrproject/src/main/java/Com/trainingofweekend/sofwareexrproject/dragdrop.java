package Com.trainingofweekend.sofwareexrproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("Hello World");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\taghs\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.get("https://jqueryui.com/droppable");
	Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement dragable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Thread.sleep(5000); 
	Actions ob=new Actions(driver);
		ob.dragAndDrop(dragable, droppable).build().perform();
		//ob.dragAndDropBy(droppable, 30,100);
		driver.switchTo().parentFrame();
		WebElement demos= driver.findElement(By.xpath("//a[@href='https://jqueryui.com/demos/']"));
		Thread.sleep(5000); 
		demos.click(); Thread.sleep(5000); 
		WebElement resizable= driver.findElement(By.xpath("//a[@href='http://jqueryui.com/resizable/']"));
				resizable.click(); Thread.sleep(5000); 
		Actions ob1=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/resizable");
		WebElement resizeable=driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		ob1.dragAndDropBy(resizeable, 30,100).perform();
		
		WebElement selectable= driver.findElement(By.xpath("//a[@href='http://jqueryui.com/selectable/']"));
		selectable.click(); Thread.sleep(5000); 
Actions ob2=new Actions(driver);
ob2.clickAndHold(selectable).moveByOffset(10,15).perform();

//resizable.click(); Thread.sleep(5000); 

		//driver.close();	
		//ob.clickAndHold(resizeble).moveByOffset(10, 150);
		
		
	}

}
