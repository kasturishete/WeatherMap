package weatherMap_Modules;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import commonUtils.commonUtils;
import weatherMap_Pages.WeatherMap_Page;

public class WeatherMap_Action {

	public WeatherMap_Action() {
		PageFactory.initElements(commonUtils.getDriver(), WeatherMap_Page.class);
	}

	public void launchUrl(String url) {
		commonUtils.launchUrl(url);
	}

	public void closeUrl() {
		commonUtils.closeUrl();
	}

	public void enterCity(String city) {
		commonUtils.editfield(WeatherMap_Page.cityNametxbox, city);
	}

	public void clickSearchButton() {
		commonUtils.clickonButton(WeatherMap_Page.searchButton);
	}

	public void verifymessage() {
		String msg = commonUtils.getTextFromUI(WeatherMap_Page.alertMsg);
		String Actual = msg.split("\n")[1];
		Assert.assertTrue(Actual.contains("Not found"));
	}

	public void verifyresult() {
		String result = commonUtils.getTextFromUI(WeatherMap_Page.weatherDisplay);
		System.out.println(result);
		WeatherMap_Page.weatherDisplay.isDisplayed();
	}

	public void weatherlabel(String weather) {
		String weblabel = commonUtils.getTextFromUI(WeatherMap_Page.Weather);
		Assert.assertTrue(weblabel.contains(weather));
		System.out.println("Weather label is present, Passed");

	}

	public void Maplabel(String map) {
		String weblabel = commonUtils.getTextFromUI(WeatherMap_Page.Maps);
		Assert.assertTrue(weblabel.contains(map));
		System.out.println("Map label is present, Passed");
	}

	public void Pricelabel(String price) {
		String weblabel = commonUtils.getTextFromUI(WeatherMap_Page.Price);
		Assert.assertTrue(weblabel.contains(price));
		System.out.println("Price label is present, Passed");

	}

	public void Stationlabel(String station) {
		String weblabel = commonUtils.getTextFromUI(WeatherMap_Page.Station);
		Assert.assertTrue(weblabel.contains(station));
		System.out.println("Station label is present, Passed");
	}

	public void clickOnSignIn() {
		commonUtils.clickonButton(WeatherMap_Page.SignIn);
		commonUtils.waitTime();
	}

	public void enterUserNm(String name) {
		commonUtils.editfield(WeatherMap_Page.userName, name);
	}

	public void enterUserPwd(String password) {
		commonUtils.editfield(WeatherMap_Page.userPasword, password);
	}

	public void clickOnSubmit() {
		commonUtils.clickonButton(WeatherMap_Page.submitButton);
	}

	public void LoginStatus() {
		String weblabel = commonUtils.getTextFromUI(WeatherMap_Page.InvalidUmPwd);
		System.out.println("User is not able to login");
		System.out.println(weblabel);

	}
}
