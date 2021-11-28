package Com.trainingofweekend.sofwareexrproject;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class twowindow {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\taghs\\eclipse-workspace\\sofwareexrproject\\drivers\\chromedriver.exe");      
		   driver=new ChromeDriver();
		   driver.get("https://www.amazon.com");
		   driver.manage().window().maximize();
		   
		   Thread.sleep(5000);
		   Actions ob=  new Actions(driver);
		   ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		  WebElement fashion= driver.findElement(By.xpath("(//*[text()='Fashion'])[1]"));
		  fashion.click();
		   ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		   
		   Set<String> winsession=driver.getWindowHandles();
		   Iterator<String> itr= winsession.iterator();
	       

		   
		   String window1= itr.next();
		   String window2= itr.next();
		   System.out.println("Session id of 1st window is = " + window1);
		   System.out.println("Session id of 2nd window is = " + window2);
		   Thread.sleep(5000);
		   driver.switchTo().window(window2);
		   driver.findElement(By.xpath("//*[@alt='Holiday Style Heroes. The Fashion gift guide.']")).click();
		   	
		   
	}

}
