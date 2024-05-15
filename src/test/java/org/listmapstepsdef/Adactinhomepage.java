package org.listmapstepsdef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.stepsdef.Adactinpom;
import org.stepsdef.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinhomepage extends BaseClass {
	Adactinpom p;

	@Given("user Launch the Browser")
	public void user_launch_the_browser() {
		launchBrowser("edge");
		launchurl("http://adactinhotelapp.com/");
		maximizeBrowser();
	}

	@When("user Pass the valid username and Valid password")
	public void user_pass_the_valid_username_and_valid_password(DataTable d) {
		p = new Adactinpom();
		List<List<String>> a = d.asLists();
		List<String> list = a.get(0);

	
		entertext(p.getUsername(),list.get(0));
		entertext(p.getPassword(), list.get(1));
		
	}

	@When("user click login button")
	public void user_click_login_button() {
		p=new Adactinpom();
		clickElement(p.getLogin());
	}

	@Then("user validate the navigation of next page")
	public void user_validate_the_navigation_of_next_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed());
	}

}
