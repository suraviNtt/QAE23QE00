package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(accountList).build().perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Create a Wish List']")).click();
		Thread.sleep(2000);
		String ExpectedUrl = "https://www.amazon.in/hz/wishlist/intro";
		String ActualURL = driver.getCurrentUrl();
		if(ExpectedUrl.equals(ActualURL)) {
			System.out.println("Create Wishlist page is loaded");
		}
	}
}
