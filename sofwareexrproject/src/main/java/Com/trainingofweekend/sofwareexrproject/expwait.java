package Com.trainingofweekend.sofwareexrproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expwait {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\taghs\\eclipse-workspace\\sofwareexrproject\\drivers\\chromedriver.exe");      
		   driver=new ChromeDriver();
		   driver.get("https://www.amazon.com");
		   WebDriverWait ob= new WebDriverWait(driver,20);
		  // ob.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
		   ob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='twotabsearchtextbox']")));
	String sessionid= driver.getWindowHandle();
	System.out.println("Secssion id of this window is =  "+ sessionid);
	
	
	
	}

}
