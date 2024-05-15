package org.stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSelectHotelPage extends BaseClass {
	Adactinpom p;
	
	

	@When("user select the hotel using radio button")
	public void user_select_the_hotel_using_radio_button() {
		p = new Adactinpom();
		clickElement(p.getRadioBtn());
		
	}
	@Then("click continue button")
	public void click_continue_button() {
		p = new Adactinpom();
		clickElement(p.getCont());
	}



	
	
	
	
	
	
	
	
	
}

	/*@Given("user select the hotel using radio button")
	public void user_on_the_select_hotel_page() {
	   System.out.println(driver.getCurrentUrl());
	}
	@When("user select the hotel using radio button")
	public void user_select_the_hotel_using_radio_button() {
		
	}
	@Then("click continue button")
	public void click_continue_button() {
	
	}



}*/
