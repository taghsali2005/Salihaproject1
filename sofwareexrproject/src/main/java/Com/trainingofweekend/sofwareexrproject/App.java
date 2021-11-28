package Com.trainingofweekend.sofwareexrproject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver Driver;
    public static void main( String[] args ) throws InterruptedException
    {
      System.out.println( "Hello World!" );
  System.setProperty("webdriver.chrome.driver","C:\\Users\\taghs\\eclipse-workspace\\sofwareexrproject\\drivers\\chromedriver.exe");      
   Driver=new ChromeDriver(); 
   Driver.get("https://www.facebook.com");//to open facebook
   WebElement emailname= Driver.findElement(By.id("email"));
   emailname.sendKeys("sako@gmail.com");
   WebElement passfield= Driver.findElement(By.id("pass"));
    passfield.sendKeys("dfjfjfk");
  WebElement loginbutton= Driver.findElement(By.name("login"));
   loginbutton.click();
   Thread.sleep(12000);
   Driver.close();
   
    }
}
