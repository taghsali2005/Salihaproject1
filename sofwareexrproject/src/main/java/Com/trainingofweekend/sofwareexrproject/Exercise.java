package Com.trainingofweekend.sofwareexrproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Exercise {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\taghs\\eclipse-workspace\\sofwareexrproject\\drivers\\chromedriver.exe");      
		   driver=new ChromeDriver();
		   driver.get("https://www.dominos.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   WebElement close= driver.findElement(By.xpath("(//*[@fill='#000000'])[2]"));
		   close.click();
 Thread.sleep(5000);
//*[@data-quid='main-navigation-order-online']
		  Actions ob=  new Actions(driver);
		   //ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		  
// WebElement OrderMenu= driver.findElement(By.xpath("(//*[@data-quid='main-navigation-order-online'] )" ));
 WebElement OrderMenu= driver.findElement(By.xpath("//*[@href='/en/pages/order/']" ));
			  OrderMenu.click();
			  Thread.sleep(5000);
			  // ob.keyUp(Keys.LEFT_SHIFT).build().perform();
WebElement OrderOnligne= driver.findElement(By.xpath("//*[@data-quid='easy-order-locator-delivery']"));
			  OrderOnligne.click();
			  Thread.sleep(5000);
WebElement AdessType=driver.findElement(By.xpath("//*[@id='Address_Type_Select']"));
AdessType.click();
WebElement Apartment=driver.findElement(By.xpath("//*[@value='Apartment']"));
Apartment.click();
//Select ob1=new Select(AdessType);
//ob1.deselectByVisibleText("apartment");
//Select ob= new Select(bdmonth);
//ob.selectByVisibleText("Mar");
//ob.selectByIndex(2);
//ob.selectByValue("3");
//Thread.sleep(4000);
//WebElement dirthdayday= driver.findElement(By.id("day"));
//dirthdayday.click();
//Select ob2= new Select(dirthdayday);
//ob2.selectByValue("23");
//WebElement dirthdayear= driver.findElement(By.xpath("//*[@title='Year']"));
//dirthdayear.click();

//Select ob3= new Select(dirthdayear);
//ob3.selectByValue("1980");
//Thread.sleep(4000);
//WebElement gender=driver.findElement(By.xpath("(//*[@class='_58mt'][1])"));
//WebElement gender=driver.findElement(By.xpath("(//*[@value='1'])"));
//gender.click();

	}

}
