package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		//Thread.sleep(800);
		driver.switchTo().alert().dismiss();
		submitButton.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("");
	}
}
