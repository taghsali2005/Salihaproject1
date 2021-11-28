package Com.trainingofweekend.sofwareexrproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dragdrop2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println( "Hello World!" );
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\taghs\\eclipse-workspace\\sofwareexrproject\\drivers\\chromedriver.exe");      
		   driver=new ChromeDriver(); 
		   driver.get("https://www.facebook.com");//to open facebook
		   WebElement emailname= driver.findElement(By.id("email"));
		   emailname.sendKeys("sako@gmail.com");
	}

}
