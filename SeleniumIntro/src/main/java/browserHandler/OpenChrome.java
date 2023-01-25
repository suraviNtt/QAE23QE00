package browserHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement saerchBox = driver.findElement(By.name("q"));
		saerchBox.sendKeys("Selenium");
		saerchBox.sendKeys(Keys.ENTER);
		
		//Thread.sleep(2000);
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
