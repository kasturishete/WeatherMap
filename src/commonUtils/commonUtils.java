package commonUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonUtils {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "/Kasturi/UseCase/weathermap/src/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

//** This method is to launch URL */
	public static void launchUrl(String url) {
		driver.get(url);
		waitTime();
	}

//** This is to close URL */
	public static void closeUrl() {
		waitTime();
		driver.close();
		driver = null;
	}

//**This method is to enter text in Text box */
	public static void editfield(WebElement element, String value) {
		try {
			element.clear();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			element.sendKeys(new CharSequence[] { value });

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//** This method is to click on button */
	public static void clickonButton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//** This is method to get text from Web element */
	public static String getTextFromUI(WebElement element) {

		String text = null;
		try {
			text = element.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

//** This is for wait time  */
	public static void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
