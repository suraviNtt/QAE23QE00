package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("(//*[@id='products']//a)[2]"));
		WebElement target = driver.findElement(By.id("amt7"));
		action.dragAndDrop(source, target).build().perform();
	}
}
