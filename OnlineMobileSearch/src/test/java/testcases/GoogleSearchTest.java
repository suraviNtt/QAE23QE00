package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import browserHandler.BrowserSetup;
import dataReaders.PropertiesReader;
import utilities.CommonMethods;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		PropertiesReader pr = new PropertiesReader();
		
		WebDriver driver = BrowserSetup.setBrowser(pr.getBrowserType());
		CommonMethods commonMethods = new CommonMethods();
		
		driver.get(pr.getURL());
		Thread.sleep(2000);
		WebElement saerchBox = driver.findElement(By.name("q"));
		commonMethods.sendTextToElement(saerchBox, "selenium");
		commonMethods.sendKeysToElement(saerchBox, Keys.ENTER);
		List<WebElement> searchResult = driver.findElements(By.xpath("//div[@id='rso']//h3"));
		for (WebElement webElement : searchResult) {
			String srearchElement = webElement.getText();
			if (srearchElement != null && srearchElement != "")
				System.out.println(srearchElement);
		}
		
	}
}
