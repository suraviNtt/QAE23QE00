package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	/**
	 * sending text to an web element
	 * @param element
	 * @param text
	 */
	public void sendTextToElement(WebElement element , String text) {
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click not success");
		}
	}
	
	/**
	 * 
	 * @param element
	 * @param key
	 */
	public void sendKeysToElement(WebElement element , Keys key) {
		try {
			element.sendKeys(key);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
