package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement saerchBox = driver.findElement(By.name("q"));
		saerchBox.sendKeys("Selenium");
		saerchBox.sendKeys(Keys.ENTER);
		List<WebElement> searchResult = driver.findElements(By.xpath("//div[@id='rso']//h3"));
		for (WebElement webElement : searchResult) {
			String srearchElement = webElement.getText();
			if (srearchElement != null && srearchElement != "")
				System.out.println(srearchElement);
		}
	}
}
