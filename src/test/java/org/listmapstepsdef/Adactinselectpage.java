package org.listmapstepsdef;

import org.stepsdef.Adactinpom;
import org.stepsdef.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinselectpage extends BaseClass {
	Adactinpom p;

	@When("user select the hotel using radio button")
	public void user_select_the_hotel_using_radio_button() {
	 p= new Adactinpom();
	 clickElement(p.getRadioBtn());
	 
	}
	@Then("click continue button")
	public void click_continue_button() {
	   p= new Adactinpom();
	   clickElement(p.getCont());
	}



}
