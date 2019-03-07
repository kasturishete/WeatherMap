package weatherMap_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeatherMap_Page {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Your city name']")
	public static WebElement cityNametxbox;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")
	public static WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//div[@id='forecast_list_ul']/div")
	public static WebElement alertMsg;

	@FindBy(how = How.XPATH, using = "(//*[@id='forecast_list_ul']/table/tbody/tr/td[2][1])")
	public static WebElement weatherDisplay;

	@FindBy(how = How.XPATH, using = "//*[text()='Weather']")
	public static WebElement Weather;

	@FindBy(how = How.XPATH, using = "//*[text()='Maps ']")
	public static WebElement Maps;

	@FindBy(how = How.XPATH, using = "//*[text()='Guide']")
	public static WebElement Guide;

	@FindBy(how = How.XPATH, using = "//*[text()='Price']")
	public static WebElement Price;

	@FindBy(how = How.XPATH, using = "//*[text()='Stations']")
	public static WebElement Station;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Sign In')]")
	public static WebElement SignIn;

	@FindBy(how = How.ID, using = "user_email")
	public static WebElement userName;

	@FindBy(how = How.ID, using = "user_password")
	public static WebElement userPasword;

	@FindBy(how = How.XPATH, using = "(//input[@name='commit'])[1]")
	public static WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//*[text()='Alert']/following::div[1]")
	public static WebElement InvalidUmPwd;
}
