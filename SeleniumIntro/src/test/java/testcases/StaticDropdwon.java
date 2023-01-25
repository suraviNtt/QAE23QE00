package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdwon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.name("url"));
		Select seachItem = new Select(search);
		seachItem.selectByIndex(1);
		Thread.sleep(2000);
		seachItem.selectByValue("search-alias=fashion");
		Thread.sleep(2000);
		seachItem.selectByVisibleText("Apps & Games");
		
	}
}
