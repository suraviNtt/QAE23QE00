package utilities;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author User
 *
 */
public class AlertHandler {
	WebDriver driver;
	
	public AlertHandler(WebDriver driver ) {
		this.driver = driver;
	}
	
	/**
	 * 
	 */
	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
