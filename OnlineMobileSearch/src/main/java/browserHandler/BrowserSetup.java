package browserHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {

	/**
	 * This method is for using multiple browsers
	 * @param browserType
	 * @return
	 */
	public static WebDriver setBrowser(String browserType) {
		WebDriver driver = null;
		switch (browserType) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		
		case "firefox": {
			driver = new FirefoxDriver();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + browserType);
		}
		driver.manage().window().maximize();
		return driver;
	}
}
