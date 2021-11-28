package Com.trainingofweekend.sofwareexrproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class display {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\taghs\\eclipse-workspace\\sofwareexrproject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
//WebElement searchbox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
//System.out.println("The element is displyed");
		try {
			boolean bool = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).isDisplayed();
			System.out.println(bool);
		} catch (Exception e) {
			System.out.println("either element is not present or not present");
		}
		if (driver.findElements(By.xpath("//*[@id='twotabsearchtextbox']")).size() > 0) {
			System.out.println("The element is present");
		} else {
			System.out.println("The element is not present");
		}
		Thread.sleep(10000);
		driver.close();
	}
}