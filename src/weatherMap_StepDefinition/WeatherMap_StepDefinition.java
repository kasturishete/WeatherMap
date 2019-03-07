package weatherMap_StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import weatherMap_Modules.WeatherMap_Action;

public class WeatherMap_StepDefinition {

	WeatherMap_Action WeatherMap = new WeatherMap_Action();

	@Given("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) {
		WeatherMap.launchUrl(url);
	}

	@When("^User enters invalid city \"([^\"]*)\" in search box$")
	public void user_enters_invalid_city_in_search_box(String city) {
		WeatherMap.enterCity(city);
	}

	@When("^click on Search button$")
	public void click_on_Search_button() {
		WeatherMap.clickSearchButton();
	}

	@Then("^Not found message should be displayed$")
	public void not_found_message_should_be_displayed() {
		WeatherMap.verifymessage();
	}

	@Then("^User close the URL$")
	public void user_close_the_URL() {
		WeatherMap.closeUrl();
	}

	@When("^User enters valid city name \"([^\"]*)\" in search box$")
	public void user_enters_valid_city_name_in_search_box(String city) {
		WeatherMap.enterCity(city);
	}

	@Then("^Weather details should be displayed$")
	public void weather_details_should_be_displayed() {
		WeatherMap.verifyresult();

	}

	@Then("^\"([^\"]*)\" weather label should be present$")
	public void weather_label_should_be_present(String weather) {
		WeatherMap.weatherlabel(weather);
	}

	@Then("^\"([^\"]*)\" map label should be present$")
	public void map_label_should_be_present(String map) {
		WeatherMap.Maplabel(map);

	}

	@Then("^\"([^\"]*)\" price label should be present$")
	public void price_label_should_be_present(String price) {
		WeatherMap.Pricelabel(price);
	}

	@Then("^\"([^\"]*)\" station label should be present$")
	public void station_label_should_be_present(String station) {
		WeatherMap.Stationlabel(station);
	}

	@Given("^User clicks on Sign In$")
	public void user_clicks_on_Sign_In() {
		WeatherMap.clickOnSignIn();
	}

	@When("^User enters invalid username as \"([^\"]*)\"$")
	public void user_enters_invalid_username_as(String name) {
		WeatherMap.enterUserNm(name);
	}

	@When("^User enters invalid password as \"([^\"]*)\"$")
	public void user_enters_invalid_password_as(String password) {
		WeatherMap.enterUserPwd(password);
	}

	@Then("^User should not be able to login$")
	public void user_should_not_be_able_to_login() {
		WeatherMap.clickOnSubmit();
		WeatherMap.LoginStatus();
	}

}
