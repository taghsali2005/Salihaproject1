package Com.trainingofweekend.sofwareexrproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class impwait {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\taghs\\eclipse-workspace\\sofwareexrproject\\drivers\\chromedriver.exe");      
		   driver=new ChromeDriver();
		   driver.get("https://www.amazon.com");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   WebElement searchbox= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		   searchbox.click();
	}

}
